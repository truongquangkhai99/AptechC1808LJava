import javafx.application.Application;
import javafx.stage.Stage;
import sun.security.provider.SHA;

import java.util.ArrayList;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        CalculationStage calculationStage = new CalculationStage();

    }

    public static void main(String[] args) {
        /*
        System.out.println("Hello");
        //Shape shape = new Shape();//cannot init an object from an Abstract Class
        Rectangle r1 = new Rectangle(100.0, 120.0, "red");
        Cirle c1 = new Cirle(12.0, "green");
        System.out.println("Area is :"+r1.getArea());
        ArrayList<Cirle> cirles = new ArrayList<Cirle>();
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(r1);
        shapes.add(c1);
        //cirles.add(r1);
        //Polymophism
        ILearning p = new Person("John", "12-12-2000", 23);
        p.gotoLibrary();
        */
        Application.launch(args);
    }

}
