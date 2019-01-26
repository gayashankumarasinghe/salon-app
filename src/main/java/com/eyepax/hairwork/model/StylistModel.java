package com.eyepax.hairwork.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="Stylist")

public class StylistModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "stylist_id")
    private Integer id; //salon id
    @Column(name = "Name")
    private  String name;
    @Column(name = "Skills")
    private String skills;
    @Column(name = "City")
    private  String city;
    @Column(name = "Rate")
    private  String rate;
    @Column(name = "Email")
    private String email;
    @Column(name = "Description")
    private  String description;
    @Column(name = "StreetAddress")
    private  String street_address;
//    @Column(name = "Website")
//    private  String website;
    @Column(name = "Facebook")
    private String facebook;
    @Column(name = "BookingDates")
    private String[] booking_dates;
//    @Column(name = "PostalCode")

    public void setId(Integer id) {
        this.id = id;
    }

    public StylistModel(Integer id, String name, String skills, String city, String rate, String email, String description, String street_address, String facebook, String[] booking_dates) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.city = city;
        this.rate = rate;
        this.email = email;
        this.description = description;
        this.street_address = street_address;
        this.facebook = facebook;
        this.booking_dates = booking_dates;
    }

    public String[] getBooking_dates() {
        return booking_dates;
    }

    public void setBooking_dates(String[] booking_dates) {
        this.booking_dates = booking_dates;
    }

    public StylistModel(String skills) {
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSkills() {
        return skills;
    }

    public String getCity() {
        return city;
    }

    public String getRate() {
        return rate;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getStreet_address() {
        return street_address;
    }

    public String getFacebook() {
        return facebook;
    }
//    private  Integer postal_code;

    public StylistModel() {
    }
}
