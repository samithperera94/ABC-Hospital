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
public class Patient_register {
    private int PID;
    private int RegID;
    private String admitted_date;
    private String  ward_name;
    private int ward_num;
    private String address;
    private String telephone;
    private String gurdian;

    /**
     * @return the PID
     */
    public int getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(int PID) {
        this.PID = PID;
    }

    /**
     * @return the admitted_date
     */
    public String getAdmitted_date() {
        return admitted_date;
    }

    /**
     * @param admitted_date the admitted_date to set
     */
    public void setAdmitted_date(String admitted_date) {
        this.admitted_date = admitted_date;
    }

    /**
     * @return the ward_name
     */
    public String getWard_name() {
        return ward_name;
    }

    /**
     * @param ward_name the ward_name to set
     */
    public void setWard_name(String ward_name) {
        this.ward_name = ward_name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the gurdian
     */
    public String getGurdian() {
        return gurdian;
    }

    /**
     * @param gurdian the gurdian to set
     */
    public void setGurdian(String gurdian) {
        this.gurdian = gurdian;
    }

    /**
     * @return the RegID
     */
    public int getRegID() {
        return RegID;
    }

    /**
     * @param RegID the RegID to set
     */
    public void setRegID(int RegID) {
        this.RegID = RegID;
    }

    /**
     * @return the ward_num
     */
    public int getWard_num() {
        return ward_num;
    }

    /**
     * @param ward_num the ward_num to set
     */
    public void setWard_num(int ward_num) {
        this.ward_num = ward_num;
    }
    
}
