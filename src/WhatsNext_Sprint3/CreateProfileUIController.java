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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Laura
 */
public class CreateProfileUIController {
    @FXML private TextField username;
    @FXML private PasswordField cpassword;
    @FXML private PasswordField password;
    @FXML private AnchorPane pane;
    private ProfileList profileList = ProfileList.getTheProfileList();
    
    
    @FXML protected void handleNewProfileButtonAction(ActionEvent event) {
        String theUsername = username.getText();
        String thePassword = password.getText();
        String theCPassword = cpassword.getText();
        if(thePassword.equals(theCPassword))
        {
            Profile profile = new Profile(username.getText(), cpassword.getText());
            profileList.addProfile(profile);
            try{
                Stage stage1 = (Stage)pane.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                stage1.setWidth(400);
                Scene scene = new Scene(root, 400, 400);
                stage1.setScene(scene);

                stage1.show();
            }catch(Exception e){

            }
        }
    }
}
