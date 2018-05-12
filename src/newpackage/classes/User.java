/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage.classes;

/**
 *
 * @author samith
 */
public class User {
    private String UID;
    private int EID;
    private String name;
    private String position;
    private String password;

    /**
     * @return the UID
     */
    public String getUID() {
        return UID;
    }

    /**
     * @param UID the UID to set
     */
    public void setUID(String UID) {
        this.UID = UID;
    }

    /**
     * @return the EID
     */
    public int getEID() {
        return EID;
    }

    /**
     * @param EID the EID to set
     */
    public void setEID(int EID) {
        this.EID = EID;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
