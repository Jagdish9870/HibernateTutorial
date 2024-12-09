package org.example;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="EMP_DETAILS")  // this annotation help in creating table with desired name
public class Employee {

    @Id //unique or primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // id will be incremented automatically without taking input from user
    private int id;

    @Column(name="EMP_NAME" ,nullable = false,length = 10)  // changing column name
    private String name;

    private String token, gmail;

    @Temporal(TemporalType.TIMESTAMP)  // formating time accordingly
    private Date joining_date;
    private double Salary;

    @Transient()  // in case you dont want to create column
    private boolean status;
    public Employee(){

    }

    public Employee(int id, String name, String token, String gmail, Date joining_date, double salary, boolean status) {
        this.id = id;
        this.name = name;
        this.token = token;
        this.gmail = gmail;
        this.joining_date = joining_date;
        Salary = salary;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public Date getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", token='" + token + '\'' +
                ", gmail='" + gmail + '\'' +
                ", joining_date=" + joining_date +
                ", Salary=" + Salary +
                ", status=" + status +
                '}';
    }
}

