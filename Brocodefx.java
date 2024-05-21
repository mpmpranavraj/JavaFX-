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

public class Brocodefx extends Application {
    public static void main(String[] args){
        launch(args);
        

    }
     @Override
    public void start(Stage stage) throws Exception{
      //  Stage stage = new Stage();
         Parent root = FXMLLoader.load(getClass().getResource("Brocode.fxml"));

         Group roots = new Group();
         Scene s = new Scene(root,Color.BLACK);



         stage.show();

         stage.setTitle("My Project");
         Image img = new Image("macbook.png");
         stage.getIcons().add(img);

         stage.setScene(s);

         Text t = new Text();
         t.setText("YO");
         t.setX(50);
         t.setY(40);
         t.setFont(Font.font("Verdana",40));
         t.setFill(Color.GOLD);

         Image image = new Image("macbook.png");
         ImageView view = new ImageView(image);
         view.setFitHeight(100);
         view.setFitWidth(200);
         view.setX(100);
         view.setY(100);



         roots.getChildren().add(t);
         roots.getChildren().add(view);


         





        
     }
}

