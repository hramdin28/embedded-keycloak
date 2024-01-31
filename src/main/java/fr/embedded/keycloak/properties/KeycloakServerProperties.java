package fr.embedded.keycloak.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "keycloak.server")
public class KeycloakServerProperties {

    private String contextPath;

    private AdminUserProperties adminUser;

    private RealmProperties realm;

    private String themeDir;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public AdminUserProperties getAdminUser() {
        return adminUser;
    }

    public void setAdminUser(AdminUserProperties adminUser) {
        this.adminUser = adminUser;
    }

    public RealmProperties getRealm() {
        return realm;
    }

    public void setRealm(RealmProperties realm) {
        this.realm = realm;
    }

    public String getThemeDir() {
        return themeDir;
    }

    public void setThemeDir(String themeDir) {
        this.themeDir = themeDir;
    }
}
