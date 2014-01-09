/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourplanner.dao;

import com.tourplanner.domainobjects.Profile;
import java.util.List;

/**
 *
 * @author sanket
 */
public interface ProfileDAO {
    public Profile getProfile(String username,String password );
    public void addProfile(Profile profile);
    public List<Profile> getAllProfiles();
}
