/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint3;

import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class ProfileList {
    private ArrayList<Profile> profileList;
    private UserList ulist;
    public ProfileList()
    {
        profileList = new ArrayList();
        
       
        
    }
    
    public void addProfile(Profile profile)
    {
        getProfileList().add(profile);
    }

    public ArrayList<Profile> getProfileList() {
        return profileList;
    }
}
