import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CalculationStage extends Stage {
    private TextField textFieldX = new TextField();
    private TextField textFieldY = new TextField();
    private Label lblResult = new Label();
    private Button btnCalculate = new Button("Calculate");
    private VBox vbox;
    private Scene scene;

    CalculationStage(){
        super();
        setupUI();
        setupActions();
        this.setScene(scene);
        this.show();
    }
    public void setupUI() {
        vbox = new VBox();
        vbox.setSpacing(15);
        vbox.setPadding(new Insets(10,10, 0, 10));
        vbox.getChildren().addAll(textFieldX, textFieldY, lblResult, btnCalculate);
        scene = new Scene(vbox, 400, 400);
        textFieldX.textProperty().addListener((observable, oldValue, newValue)->{
            lblResult.setText(newValue);
        });
    }
    public void setupActions() {
        btnCalculate.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                calculateSum();
            }
        });
    }
    private void calculateSum() {
        try {
            Integer x = Integer.valueOf(textFieldX.getText());
            Integer y = Integer.valueOf(textFieldY.getText());
            Integer sum = x + y;
            lblResult.setText("Sum = "+sum);
        } catch(Exception e) {
            lblResult.setText("Error = "+e.toString());
        } finally {

        }

    }
}
