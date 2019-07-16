package com.company;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.*;
import java.util.function.Consumer;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*/
        DetailUser detailUser = new DetailUser();
        User user = new User("Hoang", "hoang@gmail.com", 30);
        detailUser.setUser(user);
        //detailUser.txtName.setTExt..
        detailUser.show();
        */
        LoginStage loginStage = new LoginStage();
        loginStage.show();
    }

    public static void main(String[] args) {
        //Application.launch(args);
	// write your code here
        /*
        Calculation calculation = new Calculation();
        calculation.doTryCatch();
        */
        Set<User> users = new HashSet<User>();
        User mrHoang = new User("Hoang", "hoang12@gmail.com", 30);
        User mrHuy = new User("Huy", "hoang12@gmail.com", 40);
        User mrThang = new User("Thang", "hoang12@gmail.com", 50);
        users.add(mrHoang);
        users.add(mrHuy);
        users.add(mrThang);
        final Consumer<User> iterateFunction = user -> {
            System.out.println(user.toString());
        };
        users.forEach(iterateFunction);
        mrHoang.doSomething1.run();
        ArrayList<User> listOfUsers = new ArrayList<User>();
        listOfUsers.add(mrHoang);
        listOfUsers.add(mrHuy);
        listOfUsers.add(mrThang);
        Comparator<User> sortByAge = (user1, user2)->{
            if(user1.getAge() > user2.getAge()){
                return -1;
            } else {
                return 1;
            }
        };
        Comparator<User> sortByName = (user1, user2)->{
            return user2.getName().compareTo(user1.getName());
        };
        Collections.sort(listOfUsers, sortByName);
        listOfUsers.forEach(eachUser ->{
            System.out.println(eachUser.toString());
        });
        Application.launch(args);
    }
}
