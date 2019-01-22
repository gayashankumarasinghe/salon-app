package com.eyepax.hairwork.model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name ="Salon")
public class SalonModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "salon_id")
    private Integer id; //salon id
    @Column(name = "Name")
    private  String name;
    @Column(name = "Country")
    private String country;
    @Column(name = "City_id")
    private  Integer city_id;
    @Column(name = "Description")
    private  String description;
    @Column(name = "StreetAddress")
    private  String street_address;
    @Column(name = "Website")
    private  String website;
    @Column(name = "Facebook")
    private String facebook;
    //@Column(name = "RegisteredDate")
    //private Date registered_date;
    @Column(name = "PostalCode")
    private  Integer postal_code;
    @Column(name = "Email")
    private String email;
//removed the integer Integer id,
    public SalonModel(Integer id, String name, String country, Integer city_id, String description, String street_address, String website, String facebook, Integer postal_code, String email) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city_id = city_id;
        this.description = description;
        this.street_address = street_address;
        this.website = website;
        this.facebook = facebook;
        this.postal_code = postal_code;
        this.email = email;
    }

    public SalonModel() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

//    public Date getRegistered_date() {
//        return registered_date;
//    }
//
//    public void setRegistered_date(Date registered_date) {
//        this.registered_date = registered_date;
//    }

    public Integer getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(Integer postal_code) {
        this.postal_code = postal_code;
    }
}
