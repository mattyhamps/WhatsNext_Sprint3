/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint3;

/**
 *
 * @author Laura
 */
public class Movie {
    private String movieTitle;
    private String movieDirector;
    private String description;
    private String genre;
    
    public Movie(String aMovieTitle, String aMovieDirector, String aGenre, String aDescription){
        this.movieTitle = aMovieTitle;
        this.movieDirector = aMovieDirector;
        this.genre = aGenre;
        this.description = aDescription;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}
