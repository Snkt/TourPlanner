/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourplanner.controllers;

import com.tourplanner.dao.ProfileDAO;
import com.tourplanner.domainobjects.Profile;
import com.tourplanner.springforms.ProfileForm;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sanket
 */
@Controller
public class TempController {
    
    ProfileDAO profileDAO = null;

    public ProfileDAO getProfileDAO() {
        return profileDAO;
    }

    public void setProfileDAO(ProfileDAO profileDAO) {
        this.profileDAO = profileDAO;
    }
    
    private static List<Profile> profiles = new ArrayList<Profile>();
    
    
//    static{
//        profiles.add(new Profile("1","test1" ,"pass1" ,"usr1" ,null ));
//        profiles.add(new Profile("2","test2" ,"pass2" ,"usr2" ,null ));
//        profiles.add(new Profile("3","test3" ,"pass3" ,"usr3" ,null ));
//        profiles.add(new Profile("4","test4" ,"pass4" ,"usr4" ,null ));
//    }
    
    @RequestMapping("uploadfile.htm")
    public String login(){
        return "login";
    }
    
     @RequestMapping("temp.htm")
    public String tempMethod1(){
         
        return "temp1";
    }
     
     @RequestMapping(value = "get.htm", method = RequestMethod.GET)
	public ModelAndView get() {
		
                profiles = profileDAO.getAllProfiles();
		ProfileForm profileForm = new ProfileForm();
		profileForm.setProfiles(profiles);
		return new ModelAndView("temp1" , "profileForm", profileForm);
	}
     
     @RequestMapping(value = "save.htm", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("profileForm") ProfileForm profileForm) {
		System.out.println(profileForm);
		System.out.println(profileForm.getProfiles());
		List<Profile> profiles = profileForm.getProfiles();
		
		if(null != profiles && profiles.size() > 0) {
			TempController.profiles = profiles;
			for (Profile profile : profiles) {
				System.out.printf("%s \t %s \n", profile.getUserName(), profile.getPassword());
                                profileDAO.addProfile(profile);
			}
		}
		
		return new ModelAndView("temp2", "profileForm", profileForm);
	}
    
}
