package software.kloud.KMSPluginSDK;

import software.kloud.kms.entities.RoleJpaRecord;

public class NavBarEntity {
    private String linkText;
    private String path;
    private RoleJpaRecord role;

    public NavBarEntity() {
    }

    public NavBarEntity(String linkText, String path, RoleJpaRecord role) {
        this.linkText = linkText;
        this.path = path;
        this.role = role;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RoleJpaRecord getRole() {
        return role;
    }

    public void setRole(RoleJpaRecord role) {
        this.role = role;
    }
}
