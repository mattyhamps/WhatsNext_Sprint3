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
import javafx.stage.Stage;


/**
 *
 * @author mattb
 */
public class MainMenuUIController {
    
    
    @FXML protected void handleProfileButtonAction(ActionEvent event) {
        
        
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateProfile.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage1 = new Stage();
            Scene scene = new Scene(root, 400, 400);
            stage1.setScene(scene);

            stage1.show();
        }catch(Exception e){

        }
    }
    
    

        
    
    
}
