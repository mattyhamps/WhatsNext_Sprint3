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
    private ArrayList<Profile> theUserList;
    private UserList ulist;
    private static ProfileList theProfileList;
    
    private ProfileList()
    {
        theUserList = new ArrayList();
    }
    
    public static ProfileList getTheProfileList()
    {
        if (theProfileList != null){
            return theProfileList;
        }else {
            theProfileList = new ProfileList();
            return theProfileList;
        }
        
    }
    
    public void addProfile(Profile profile)
    {
        getProfileList().add(profile);
    }

    public ArrayList<Profile> getProfileList() {
        return theUserList;
    }
}
