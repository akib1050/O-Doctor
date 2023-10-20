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
public class bbRow {
    String name, group, lastdonation, contact;

    public bbRow(String name, String group, String lastdonation, String contact) {
        this.name = name;
        this.group = group;
        this.lastdonation = lastdonation;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getLastdonation() {
        return lastdonation;
    }

    public String getContact() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setLastdonation(String lastdonation) {
        this.lastdonation = lastdonation;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
    
    
}
