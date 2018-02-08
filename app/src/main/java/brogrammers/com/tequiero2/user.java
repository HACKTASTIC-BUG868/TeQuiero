package brogrammers.com.tequiero2;

public class user {
    public user(String username, String emailid, String logic) {
        this.username = username;
        this.emailid = emailid;
        this.logic = logic;
    }

    private String username;
    private String emailid;
    private String logic;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }
}
