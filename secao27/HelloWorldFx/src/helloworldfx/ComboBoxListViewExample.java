package helloworldfx;

//import java.util.Observable;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class ComboBoxListViewExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        // ComboBox Example
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Opção A", "Opção B", "Opção C");
        comboBox.setPromptText("Selecione uma opção");
        
        Label comboBoxLabel = new Label("Seleção do ComboBox: ");
        comboBox.setOnAction(event -> {
            String selected = comboBox.getSelectionModel().getSelectedItem();
            comboBoxLabel.setText("Opção selecionada: " + selected);
        });     
               

        // ListView Example
        ObservableList<String> items = FXCollections.observableArrayList (
            "Item 1", "Item 2", "Item 3", "Item 4", "Item 5");
        ListView<String> listView = new ListView<>(items);
        listView.setPrefHeight(150);
        listView.getSelectionModel().selectedIndexProperty().addListener((obs, oldVal, newVal) -> {
            String selected = listView.getSelectionModel().getSelectedItem();
            //int novoValor = newVal.intValue() + 1;
            comboBoxLabel.setText("Item selecionado da ListView: " + " - " + selected);
            listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        });

        VBox vbox = new VBox();
        vbox.getChildren().addAll(comboBoxLabel, comboBox, listView);
        

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox, HBox, Button e Label");
        primaryStage.setScene(scene);
        primaryStage.show();       
        
    }   

    public static void main(String[] args) {
        launch(args);
    }
}
