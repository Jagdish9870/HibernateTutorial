package org.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id // primary key
    private int id;
    private String Name, EMail, Address;
    public Student(int id, String name, String EMail, String address) {
        this.id = id;
        Name = name;
        this.EMail = EMail;
        Address = address;
    }
    public Student(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
