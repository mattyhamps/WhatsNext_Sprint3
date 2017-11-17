/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Laura
 */
public class Search_MovieUIController {
    @FXML private AnchorPane pane;
    
    @FXML protected void handleMovieFilterButtonAction(ActionEvent event) {
        
        
        try{
            Stage stage1 = (Stage)pane.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Filters.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            stage1.setWidth(600);
            Scene scene = new Scene(root, 600, 400);
            stage1.setScene(scene);

            stage1.show();
        }catch(Exception e){

        }
    }
    @FXML protected void handleReturnToMainMenuButtonAction(ActionEvent event) {
        
        
        try{
            Stage stage1 = (Stage)pane.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            stage1.setWidth(600);
            Scene scene = new Scene(root, 600, 400);
            stage1.setScene(scene);

            stage1.show();
        }catch(Exception e){

        }
    }
}
