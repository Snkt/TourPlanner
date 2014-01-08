/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourplanner.dao;

import com.tourplanner.domainobjects.Profile;

/**
 *
 * @author sanket
 */
public interface ProfileDAO {
    public Profile getProfile(String username,String password );
}
