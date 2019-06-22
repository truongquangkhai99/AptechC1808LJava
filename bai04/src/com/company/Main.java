package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        DetailUser detailUser = new DetailUser();
        User user = new User("Hoang", "hoang@gmail.com", 30);
        detailUser.setUser(user);
        //detailUser.txtName.setTExt..
        detailUser.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
	// write your code here
        /*
        Calculation calculation = new Calculation();
        calculation.doTryCatch();
        */
    }
}
