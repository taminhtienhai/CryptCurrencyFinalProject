package iuh.project.model;

public class Wallet {

    private String pk;
    private String display_name;
    private String email;

    public Wallet() {
        
    }

    /**
     * @return the pk
     */
    public String getPk() {
        return pk;
    }

    /**
     * @return the display_name
     */
    public String getDisplay_name() {
        return display_name;
    }

    /**
     * @param display_name the display_name to set
     */
    public void setDisplay_name(final String display_name) {
        this.display_name = display_name;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @param pk the pk to set
     */
    public void setPk(final String pk) {
        this.pk = pk;
    }


}