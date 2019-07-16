package com.company;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DetailUser extends Stage {
    private TextField txtName = new TextField();
    private TextField txtEmail = new TextField();
    private Button btnLogin = new Button("Do something");
    DetailUser(){
        VBox vbox = new VBox();
        vbox.getChildren().addAll(txtName, txtEmail, btnLogin);
        Scene scene = new Scene(vbox, 200, 200);
        setScene(scene);
    }
    public void setUser(User user) {
        this.user = user;
        txtName.setText(user.getName());
        txtEmail.setText(user.getEmail());
    }
    //data = "state"
    private User user;

}
