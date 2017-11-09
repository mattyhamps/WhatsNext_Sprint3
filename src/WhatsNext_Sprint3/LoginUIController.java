package WhatsNext_Sprint3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;

import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginUIController {
    
    @FXML private Text actiontarget;
    @FXML private TextField username;
    @FXML private PasswordField password;
    @FXML private GridPane pane;
    
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        
        LoginController loginCtrl = new LoginController(this);
        
        String u = username.getText();
        String p = password.getText();
        
        boolean isAuthenticated = loginCtrl.requestAuthenticate(u, p);

        
        if(isAuthenticated){
            
            /* Code to open Main Menu goes here*/
            try{
                Stage stage1 = (Stage)pane.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                
                Scene scene = new Scene(root, 400, 400);
                stage1.setHeight(400);
                stage1.setWidth(400);
                
                stage1.setScene(scene);

                stage1.show();
            }catch(Exception e){

            }
        }else{
            username.setText(null);
            password.setText(null);
            actiontarget.setText("Enter valid username and password");
        }
       
    }
}
