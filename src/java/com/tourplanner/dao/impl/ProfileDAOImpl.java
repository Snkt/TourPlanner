/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourplanner.dao.impl;

import com.hibernateutils.HibernateUtil;
import com.tourplanner.dao.ProfileDAO;
import com.tourplanner.domainobjects.Profile;
import org.hibernate.Query;

/**
 *
 * @author sanket
 */
public class ProfileDAOImpl implements ProfileDAO{

    @Override
    public Profile getProfile(String username, String password) {
        Query query = HibernateUtil.getSessionFactory().openSession().createQuery("from Profile where userName='"+username+"' AND password='"+password+"'");
        Profile profile = (Profile)query.uniqueResult();
    return profile;
    
    }
    
}
