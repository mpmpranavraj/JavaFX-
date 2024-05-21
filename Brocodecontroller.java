package org.example.myjavafxapp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class Brocodecontroller {

    @FXML
    private Circle movec;
        private double x;
        private double y;

        public void up(ActionEvent e) {
        //System.out.println("Up");
        movec.setCenterY(y-=30);

    }
    public void Down(ActionEvent e) {
        //System.out.println("Down");
        movec.setCenterY(y+=30);

    }
    public void Right(ActionEvent e) {
        //System.out.println("Right");
        movec.setCenterX(x+=30);
    }
    public void Left(ActionEvent e) {
       // System.out.println("Left");
        movec.setCenterX(x-=30);
    }


    }

