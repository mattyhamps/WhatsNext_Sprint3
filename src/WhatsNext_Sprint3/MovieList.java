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
public class MovieList {
    private ArrayList <Movie> movieList;
    
    public MovieList(){
        
        Movie movie1 = new Movie("Name","director","genre","desc");
        
        movieList.add(movie1);
        
        
    }
    
}
