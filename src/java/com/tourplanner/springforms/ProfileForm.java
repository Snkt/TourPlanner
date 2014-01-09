/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tourplanner.springforms;

import com.tourplanner.domainobjects.Profile;
import java.util.List;

/**
 *
 * @author sanket
 */
public class ProfileForm {
    private List<Profile> profiles;

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }
}
