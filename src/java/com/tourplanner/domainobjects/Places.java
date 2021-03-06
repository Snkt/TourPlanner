package com.tourplanner.domainobjects;
// Generated 8 Jan, 2014 11:36:33 AM by Hibernate Tools 3.2.1.GA



/**
 * Places generated by hbm2java
 */
public class Places  implements java.io.Serializable {


     private int id;
     private String placeId;
     private String description;
     private Integer ratings;
     private Integer test;

    public Integer getTest() {
        return test;
    }

    public void setTest(Integer test) {
        this.test = test;
    }

    public Places() {
    }

	
    public Places(int id) {
        this.id = id;
    }
    public Places(int id, String placeId, String description, Integer ratings) {
       this.id = id;
       this.placeId = placeId;
       this.description = description;
       this.ratings = ratings;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getPlaceId() {
        return this.placeId;
    }
    
    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getRatings() {
        return this.ratings;
    }
    
    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }




}


