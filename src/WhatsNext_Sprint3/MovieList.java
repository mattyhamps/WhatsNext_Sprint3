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
        Movie movie3 = new Movie("The Hunger Games","Gary Ross","Thriller","In what was once North America, the Capitol of Panem maintains its hold on its 12 districts by forcing them each to select a boy and a girl, called Tributes, to compete in a nationally televised event called the Hunger Games. Every citizen must watch as the youths fight to the death until only one remains. District 12 Tribute Katniss Everdeen (Jennifer Lawrence) has little to rely on, other than her hunting skills and sharp instincts, in an arena where she must weigh survival against love.");
        Movie movie4 = new Movie("Frozen","","","");      
        Movie movie5 = new Movie("Ouija: Origin of Evil","Mike Flanagan","Horror","In 1967 Los Angeles, widowed mother Alice Zander (Elizabeth Reaser) unwittingly invites authentic evil into her home by adding a new stunt to bolster her séance scam business. When the merciless spirit overtakes her youngest daughter Doris (Lulu Wilson), the small family must confront unthinkable fears to save her and send her possessor back to the other side.");  
        Movie movie6 = new Movie("","","","");  
        Movie movie7 = new Movie("","","","");  
        Movie movie8 = new Movie("","","","");  
        Movie movie9 = new Movie("","","","");  
        Movie movie10 = new Movie("","","","");  
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
