/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author DELL
 */
public class ffRow {
    String drugname, quantity, expireDate, contact;

    public ffRow(String drugname, String quantity, String expireDate, String contact) {
        this.drugname = drugname;
        this.quantity = quantity;
        this.expireDate = expireDate;
        this.contact = contact;
    }

    public String getDrugname() {
        return drugname;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public String getContact() {
        return contact;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
}
