package com.company;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import sun.security.util.Password;

public class LoginStage extends Stage implements IMyStage{
    private Scene scene;
    private Label lblTitle = new Label("Login to your account");
    private VBox vBox;
    private GridPane gridPane = new GridPane();
    private Label lblUsername = new Label("User name: ");
    private Label lblPassword = new Label("Password");
    private TextField txtName = new TextField();
    private PasswordField txtPassword = new PasswordField();
    private Button btnLogin = new Button("Login");
    LoginStage() {
        setupUI();
        setupActions();
        this.show();
    }
    @Override
    public void setupUI() {
        vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10,10,10,10));
        scene = new Scene(vBox, 300, 300);
        lblTitle.setFont(Font.font("Verdana", FontWeight.BOLD, 22));

        vBox.getChildren().addAll(lblTitle, gridPane, btnLogin);
        gridPane.add(lblUsername, 0,0);
        gridPane.add(txtName, 1,0);

        gridPane.add(lblPassword, 0,1);
        gridPane.add(txtPassword, 1,1);
        txtName.setPromptText("Enter your name");
        txtPassword.setPromptText("Enter your password");
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        this.setScene(scene);
    }

    @Override
    public void setupActions() {
        btnLogin.setOnAction(event -> {
            ProductListStage productListStage = new ProductListStage(this);
            this.hide();
        });
    }
}
