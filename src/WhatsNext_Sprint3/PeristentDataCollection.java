/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint3;

import java.io.*;

/**
 *
 * @author SHaynes
 */
public class PeristentDataCollection implements Serializable{
    
    private UserList theUserList;
    private MovieList theMovieList;
    
    // All other persistent data will go below here
    
    public PeristentDataCollection(){
        if(theUserList == null){
            theUserList = new UserList();
        }
        if(theMovieList == null){
            theMovieList = new MovieList();
        }
        
    }
    
    public UserList getuserList(){
        return theUserList;
    }
    
}
