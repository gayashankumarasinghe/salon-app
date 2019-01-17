package com.eyepax.hairwork.model;

import javax.persistence.*;

@Entity
@Table(name ="Stylist")

public class StylistModel {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "stylist_id")
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
//    @Column(name = "Website")
//    private  String website;
    @Column(name = "Facebook")
    private String facebook;
    //@Column(name = "RegisteredDate")
    //private Date registered_date;
    @Column(name = "PostalCode")
    private  Integer postal_code;
    @Column(name = "Email")
    private String email;
}
