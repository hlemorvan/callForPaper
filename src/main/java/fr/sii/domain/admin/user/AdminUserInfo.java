package fr.sii.domain.admin.user;

/**
 * Created by tmaugin on 05/05/2015.
 */
public class AdminUserInfo {
    boolean connected;
    boolean admin;
    String uri;

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public AdminUserInfo(boolean connected, boolean admin, String uri) {
        this.connected = connected;
        this.admin = admin;
        this.uri = uri;
    }
}