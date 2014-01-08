package com.tourplanner.domainobjects;
// Generated 8 Jan, 2014 11:36:33 AM by Hibernate Tools 3.2.1.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Profile generated by hbm2java
 */
@Entity
@Table(name = "Profile")
public class Profile implements java.io.Serializable {

    @Id @GeneratedValue
    @Column(name = "ID")
    private Integer id;
    @Column(name = "PROFILE_ID")
    private String profileId;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "USER_ID")
    private String userName;
    @Column(name = "PROFILE_IMAGE_PATH")
    private String profileImagePath;

    public Profile() {
    }

    public Profile(String profileId, String emailId, String password, String userName, String profileImagePath) {
        this.profileId = profileId;
        this.emailId = emailId;
        this.password = password;
        this.userName = userName;
        this.profileImagePath = profileImagePath;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProfileId() {
        return this.profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfileImagePath() {
        return this.profileImagePath;
    }

    public void setProfileImagePath(String profileImagePath) {
        this.profileImagePath = profileImagePath;
    }
}
