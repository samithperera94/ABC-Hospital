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
public class Doctor extends Employee {
    private int DID;
    private String speciality;
    private int ward_num;

    /**
     * @return the DID
     */
    public int getDID() {
        return DID;
    }

    /**
     * @param DID the DID to set
     */
    public void setDID(int DID) {
        this.DID = DID;
    }

    /**
     * @return the speciality
     */
    public String getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
