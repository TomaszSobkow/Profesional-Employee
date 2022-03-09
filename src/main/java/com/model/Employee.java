package com.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity()
@Table(name="student")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "county")
    private String county;

    @Column(name = "town")
    private String town;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "immersed")
    private LocalDate immersed;

    @Column(name = "birth")
    private LocalDate birth;


    public Employee() {  }

    public Employee(String firstName, String lastName) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getCounty() { return county; }
    public void setCounty(String county) { this.county = county; }

    public String getTown() {  return town; }
    public void setTown(String town) { this.town = town; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getMobile() {  return mobile; }
    public void setMobile(String mobile) {  this.mobile = mobile; }

    public LocalDate getImmersed() {  return immersed; }
    public void setImmersed(LocalDate immersed) { this.immersed = immersed; }

    public LocalDate getBirth() { return birth; }
    public void setBirth(LocalDate birth) { this.birth = birth; }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmailId() { return emailId; }
    public void setEmailId(String emailId) { this.emailId = emailId; }
}
