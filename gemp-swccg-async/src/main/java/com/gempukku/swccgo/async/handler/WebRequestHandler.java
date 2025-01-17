package com.gempukku.swccgo.async.handler;

import com.gempukku.swccgo.async.ResponseWriter;
import com.gempukku.swccgo.common.ApplicationConfiguration;

import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.handler.codec.http.HttpHeaders;
import org.jboss.netty.handler.codec.http.HttpRequest;

import java.io.File;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;

import static org.jboss.netty.handler.codec.http.HttpHeaders.Names.IF_NONE_MATCH;

public class WebRequestHandler implements UriRequestHandler {
    private String _root;
    private String _uniqueEtag;
    private boolean _isLocalHost = false;

    public WebRequestHandler(String root) {
        _isLocalHost = ApplicationConfiguration.getProperty("environment").equals("test");
        _root = root;
    }

    @Override
    public void handleRequest(String uri, HttpRequest request, Map<Type, Object> context, ResponseWriter responseWriter, MessageEvent e) throws Exception {
        if ("".equals(uri))
            uri = "index.html";

        uri = uri.replace('/', File.separatorChar);

        if ((uri.contains(".."))
                || uri.contains(File.separator + ".")
                || uri.startsWith(".") || uri.endsWith(".")) {
            responseWriter.writeError(403);
            return;
        }

        File file = new File(_root + uri);
        if (!file.getCanonicalPath().startsWith(_root)) {
            responseWriter.writeError(403);
            return;
        }

        if (!file.exists()) {
            responseWriter.writeError(404);
            return;
        }

        final String etag = "\"" + file.lastModified() + "\"";

        if (clientHasCurrentVersion(request, etag) && !_isLocalHost) {
            responseWriter.writeError(304);
            return;
        }

        responseWriter.writeFile(file, Collections.singletonMap(HttpHeaders.Names.ETAG, etag));
    }

    private boolean clientHasCurrentVersion(HttpRequest request, String etag) {
        String ifNoneMatch = request.getHeader(IF_NONE_MATCH);
        if (ifNoneMatch != null) {
            String[] clientKnownVersions = ifNoneMatch.split(",");
            for (String clientKnownVersion : clientKnownVersions) {
                if (clientKnownVersion.trim().equals(etag))
                    return true;
            }
        }
        return false;
    }
}
