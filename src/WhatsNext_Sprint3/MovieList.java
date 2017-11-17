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
        Movie movie4 = new Movie("Justice League","Zack Snyder","Fantasy","Fueled by his restored faith in humanity and inspired by Superman's selfless act, Bruce Wayne enlists newfound ally Diana Prince to face an even greater threat. Together, Batman and Wonder Woman work quickly to recruit a team to stand against this newly awakened enemy. Despite the formation of an unprecedented league of heroes -- Batman, Wonder Woman, Aquaman, Cyborg and the Flash -- it may be too late to save the planet from an assault of catastrophic proportions.");      
        Movie movie5 = new Movie("Ouija: Origin of Evil","Mike Flanagan","Horror","In 1967 Los Angeles, widowed mother Alice Zander (Elizabeth Reaser) unwittingly invites authentic evil into her home by adding a new stunt to bolster her séance scam business. When the merciless spirit overtakes her youngest daughter Doris (Lulu Wilson), the small family must confront unthinkable fears to save her and send her possessor back to the other side.");  
        Movie movie6 = new Movie("La La Land","Damien Chazelle","Comedy","Sebastian (Ryan Gosling) and Mia (Emma Stone) are drawn together by their common desire to do what they love. But as success mounts they are faced with decisions that begin to fray the fragile fabric of their love affair, and the dreams they worked so hard to maintain in each other threaten to rip them apart.");  
        Movie movie7 = new Movie("Zootopia","Rich Moore","Mystery","From the largest elephant to the smallest shrew, the city of Zootopia is a mammal metropolis where various animals live and thrive. When Judy Hopps (Ginnifer Goodwin) becomes the first rabbit to join the police force, she quickly learns how tough it is to enforce the law. Determined to prove herself, Judy jumps at the opportunity to solve a mysterious case. Unfortunately, that means working with Nick Wilde (Jason Bateman), a wily fox who makes her job even harder.");  
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
