/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint3;

/**
 *
 * @author mattb
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class FiltersUIController {
    
    @FXML private CheckBox comedy;
    @FXML private CheckBox drama;
    @FXML private CheckBox mystery;
    @FXML private CheckBox fantasy;
    @FXML private CheckBox horror;
    @FXML private CheckBox thriller;
    @FXML private CheckBox incognito;
    
    @FXML private Label incognitoSearch;
    
    @FXML private TextField positiveFilters;
    @FXML private TextField negativeFilters;
    
    @FXML private AnchorPane pane;
    
    
    
    
    @FXML protected void handleSearchAction(ActionEvent event) {
        try{
            
            
            
            Stage stage1 = (Stage)pane.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateProfile.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            stage1.setWidth(600);
            Scene scene = new Scene(root, 600, 400);
            stage1.setScene(scene);
            stage1.show();
            
        }catch(Exception e){

        }
    }
   
}
