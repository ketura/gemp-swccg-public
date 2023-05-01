package com.gempukku.swccgo.common;

/**
 * Represents the model/type of a droid, starship, or vehicle
 */
public enum ModelType implements Filterable {
    _ANY_("Any"),
    A_WING("A-wing"),
    AAT("ATT"),
    ACCLAMATOR_CLASS_ASSAULT_SHIP("Acclamator-Class Assault Ship"),
    ANCIENT_DESERT("Ancient Desert"),
    ASSASSIN("Assassin"),
    ASTROMECH("Astromech"),
    AT_AT("AT-AT"),
    AT_DP("AT_DP"),
    AT_M6("AT-M6"),
    AT_ST("AT-ST"),
    AUTOMATION("Automation"),
    AUZITUCK_GUNSHIP("Auzituck Gunship"),
    AVIAN("Avian"),
    B_WING("B-wing"),
    BATTLE("Battle"),
    BINARY_HYDROPONICS("Binary Hydroponics"),
    BAUDO_CLASS_STAR_YACHT("Baudo-Class Star Yacht"),
    BYBLOS_G1A_TRANSPORT("Byblos G-1A Transport"),
    COMMUNICATIONS("Communications"),
    CORELLIAN_CORVETTE("Corellian Corvette"),
    CORELLIAN_JM_5000("Corellian Jm 5000"),
    CORELLIAN_REPUBLIC_CRUISER("Corellian Republic Cruiser"),
    CUSTOM_PILOT_DROID("Custom Pilot Droid"),
    DESERT("Desert"),
    DESTROYER("Destroyer"),
    DLANSEAUX_STAR_YACHT("D'Lanseaux Star Yacht"),
    DREADNAUGHT_CLASS_HEAVY_CRUISER("Dreadnaught-Class Heavy Cruiser"),
    DROID_STARFIGHTER("Droid Starfighter"),
    FIRESPRAY_CLASS_ATTACK_SHIP("Firespray-Class Attack Ship"),
    FREIGHTER("Freighter"),
    GIGANTIC_PREDATOR("Gigantic Predator"),
    GUARD("Guard"),
    HAMMERHEAD_CORVETTE("Hammerhead Corvette"),
    HEAVILY_MODIFIED_FREIGHTER("Heavily-Modified Freighter"),
    HEAVILY_MODIFIED_LIGHT_FREIGHTER("Heavily-Modified Light Freighter"),
    IMPERIAL_CLASS_STAR_DESTROYER("Imperial-Class Star Destroyer"),
    INTERDICTOR_CLASS_STAR_DESTROYER("Interdictor-Class Star Destroyer"),
    INTERROGATOR("Interrogator"),
    J_TYPE_327_NUBIAN("J-Type 327 Nubian"),
    JEDI_INTERCEPTOR("Jedi Interceptor"),
    KALEVALAN_YACHT("Kalevalan Yacht"),
    LAMBDA_CLASS_SHUTTLE("Lambda-Class Shuttle"),
    MAINTENANCE("Maintenance"),
    MANDATOR_IV_CLASS_DREADNAUGHT("Mandator IV-Class Dreadnaught"),
    MEDICAL("Medical"),
    MEGA_CLASS_DREADNAUGHT("Mega-Class Dreadnaught"),
    MESSENGER("Messenger"),
    MINING("Mining"),
    MODIFIED_ACTION_VI_FREIGHTER("Modified Action VI Freighter"),
    MODIFIED_CORELLIAN_FREIGHTER("Modified Corellian Freighter"),
    MODIFIED_DELTA_7_INTERCEPTOR("Modified Delta-7 Interceptor"),
    MODIFIED_LIGHT_FREIGHTER("Modified Light Freighter"),
    MODIFIED_NEBULON_B_FRIGATE("Modified Nebulon-B Frigate"),
    MODIFIED_TRANSPORT("Modified Transport"),
    MODIFIED_VCX_FREIGHTER("Modified VCX Freighter"),
    MODIFIED_VCX_SHUTTLE("Modified VCX Shuttle"),
    MODIFIED_Z_95_HEADHUNTER("Modified Z-95 Headhunter"),
    MON_CALAMARI_STAR_CRUISER("Mon Calamari Star Cruiser"),
    MUNIFICENT_CLASS_STAR_FRIGATE("Munificent-Class Star Frigate"),
    MTT("MTT"),
    N_1_STARFIGHTER("N-1 Starfighter"),
    NAUUR_CLASS_YACHT("Nau'ur-class Yacht"),
    NEBULON_B_FRIGATE("Nebulon-B Frigate"),
    OPHIDIAN("Ophidian"),
    POWER("Power"),
    PROBE("Probe"),
    PROTOCOL("Protocol"),
    PROVIDENCE_CLASS_DREADNAUGHT("Providence-Class Dreadnaught"),
    RECON("Recon"),
    RECONNAISSANCE_FIGHTER("Reconnaissance Fighter"),
    RESISTANCE_TRANSPORT("Resistance Transport"),
    RESURGENT_CLASS_STAR_DESTROYER("Resurgent-Class Star Destroyer"),
    SCAVENGER("Scavenger"),
    SEADWELLING("Sea-Dwelling"),
    SECURITY("Security"),
    SENTINEL_CLASS_LANDING_CRAFT("Sentinel-Class Landing Craft"),
    SERVANT("Servant"),
    SHEATHIPEDE_CLASS_SHUTTLE("Sheathipede-Class Shuttle"),
    SITH_INFILTRATOR("Sith Infiltrator"),
    SKYHOOK_PLATFORM("Skyhook Platform"),
    SPACE("Space"),
    SPEEDER_BIKE("Speeder Bike"),
    SNOW("Snow"),
    STAP("STAP"),
    SUPER_CLASS_STAR_DESTROYER("Super-Class Star Destroyer"),
    SUPERVISOR("Supervisor"),
    SURRONIAN_CONQUEROR("Surronian Conqueror"),
    SWAMP("Swamp"),
    T_16("T-16"),
    T_47("T-47"),
    TALON_I_COMBAT_CLOUD_CAR("Talon I Combat Cloud Car"),
    TIE_AD("TIE/AD"),
    TIE_ADVANCED_X1("TIE Advanced x1"),
    TIE_DEFENDER("TIE Defender"),
    TIE_INTERCEPTOR("TIE Interceptor"),
    TIE_LN("TIE/ln"),
    TIE_RC("TIE/RC"),
    TIE_SA("TIE/SA"),
    TIE_SF("TIE/SF"),
    TIE_SR("TIE/sr"),
    TIE_VN("TIE/VN"),
    TRADE_FEDERATION_BATTLESHIP("Trade Federation Battleship"),
    TRADE_FEDERATION_LANDING_CRAFT("Trade Federation Landing Craft"),
    TRANSPORT("Transport"),
    TRILON_AGGRESSOR("Trilon Aggressor"),
    TWIN_POD_CLOUD_CAR("Twin-Pod Cloud Car"),
    UBRIKKIAN_LUXURY_SPACE_YACHT("Ubrikkian Luxury Space Yacht"),
    UPSILON_CLASS_SHUTTLE("Upsilon-Class Shuttle"),
    U_WING("U-wing"),
    V_4X("V-4X"),
    V_19_TORRENT_STARFIGHTER("V-19 Torrent starfighter"),
    VEHICLE("Vehicle"),
    VENATOR_CLASS_ATTACK_CRUISER("Venator-Class Attack Cruiser"),
    VICTORY_CLASS_STAR_DESTROYER("Victory-Class Star Destroyer"),
    VT_49_DECIMATOR("VT-49 Decimator"),
    WTK_85A_INTERSTELLAR_TRANSPORT("WTK-85A Interstellar Transport"),
    X_WING("X-wing"),
    Y_WING("Y-wing"),
    YV_CLASS_FREIGHTER("YV-Class Freighter"),
    Z_95_HEADHUNTER("Z-95 Headhunter"),
    ZETA_CLASS_TRANSPORT("Zeta-Class Transport");

    private String _humanReadable;
    private boolean _infoDisplayable;

    ModelType(String humanReadable) {
        this(humanReadable, false);
    }

    ModelType(String humanReadable, boolean infoDisplayable) {
        _humanReadable = humanReadable;
        _infoDisplayable = infoDisplayable;
    }

    public String getHumanReadable() {
        return _humanReadable;
    }

    public boolean isInfoDisplayable() {
        return _infoDisplayable;
    }
}
