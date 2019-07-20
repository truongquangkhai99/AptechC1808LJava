package com.company;

import com.sun.istack.internal.NotNull;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ProductListStage extends Stage implements IMyStage {
    @NotNull LoginStage loginStage;
    @NotNull Scene scene;
    VBox vBox = new VBox();
    TableView<Product> tableView = new TableView<Product>();
    TableColumn<Product, String> columnName = new TableColumn<Product, String>("name");
    TableColumn<Product, Integer> columnYear = new TableColumn<Product, Integer>("year");
    TableColumn<Product, String> columnDescription = new TableColumn<Product, String>("description");
    private Button btnAddNewProduct = new Button("Show Login");
    ProductListStage(LoginStage loginStage) {
        this.loginStage = loginStage;
        setupUI();
        setupActions();
        this.show();
    }
    @Override
    public void setupActions() {
        btnAddNewProduct.setOnAction(event -> {

        });
    }

    @Override
    public void setupUI() {

        vBox.getChildren().addAll(tableView, btnAddNewProduct);

        scene = new Scene(vBox, 300, 400);
        this.setScene(scene);
    }
}
