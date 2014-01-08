/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourplanner.controllers;

import com.tourplanner.dao.ProfileDAO;
import com.tourplanner.domainobjects.Profile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sanket
 */
@Controller
public class LoginController {
    
    ProfileDAO profileDAO = null;

    public ProfileDAO getProfileDAO() {
        return profileDAO;
    }

    public void setProfileDAO(ProfileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }
    
    @RequestMapping("login.htm")
    public String login(){
        System.out.println("in login controllerrr");
        return "login";
    }
    
    @RequestMapping("loginauth.htm")
    public String loginAuth(HttpServletRequest request, HttpServletResponse response){
     //   request.getParameter("username");
      //  request.getParameter("password");
        
        Profile profile = profileDAO.getProfile(request.getParameter("username"), request.getParameter("password"));
        if(profile==null){
            System.out.println("not matched");
            return "login";
        }else{
                        System.out.println("not matched");
            return "home";
        }
//        System.out.println("in login controllerrr"+request.getParameter("username")+request.getParameter("password"));
        
    }
}
