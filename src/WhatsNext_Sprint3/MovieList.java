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
        
        movieList = new ArrayList();
        
        Movie movie1 = new Movie("The Sandlot","David Mickey Evans","Comedy","Baseball and scary dog");
        Movie movie2 = new Movie("The Lion King", "Roger Allers", "Drama", "Dad lion dies and son lion runs away");
        movieList.add(movie1);
        movieList.add(movie2);
        
        
    }
    
    public void addMovies(Movie movie)
    {
        getMovieList().add(movie);
    }

    public ArrayList<Movie> getMovieList() {
        return movieList;
    }
    
}
