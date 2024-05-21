package org.example.myjavafxapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Css extends Application {
    public static void main(String[] args){
        launch(args);
        

    }
     @Override
    public void start(Stage stage) throws Exception{
      //  Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("Brocode.fxml"));

         Group roots = new Group();
         Scene s = new Scene(root,Color.BLACK);
         String css = this.getClass().getResource("/brocode.css").toExternalForm();
         s.getStylesheets().add(css);

         stage.getScene();




         stage.show();

         stage.setTitle("My Project");
         Image img = new Image("macbook.png");
         stage.getIcons().add(img);

         stage.setScene(s);







         





        
     }
}

