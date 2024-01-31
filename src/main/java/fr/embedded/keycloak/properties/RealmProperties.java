package fr.embedded.keycloak.properties;

public class RealmProperties {

    private String realmImportFile;
    private String realmName;
    private String realmAppClientId;
    private String realmAppClientSecret;

    public String getRealmImportFile() {
        return realmImportFile;
    }

    public void setRealmImportFile(String realmImportFile) {
        this.realmImportFile = realmImportFile;
    }

    public String getRealmName() {
        return realmName;
    }

    public void setRealmName(String realmName) {
        this.realmName = realmName;
    }

    public String getRealmAppClientId() {
        return realmAppClientId;
    }

    public void setRealmAppClientId(String realmAppClientId) {
        this.realmAppClientId = realmAppClientId;
    }

    public String getRealmAppClientSecret() {
        return realmAppClientSecret;
    }

    public void setRealmAppClientSecret(String realmAppClientSecret) {
        this.realmAppClientSecret = realmAppClientSecret;
    }

}
