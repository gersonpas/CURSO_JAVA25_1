package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class CheckboxRadioButtonExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        // Criando checkboxes
        CheckBox checkBox1 = new CheckBox("Opção 1");
        CheckBox checkBox2 = new CheckBox("Opção 2");

        Label checkboxlabel = new Label("checkBox selecionada");

        checkBox1.setOnAction(event -> updateCheckboxLabel(checkBox1, checkBox2, checkboxlabel));
        checkBox2.setOnAction(event -> updateCheckboxLabel(checkBox1, checkBox2, checkboxlabel));{
            
        

        VBox vbox = new VBox();
        vbox.getChildren().addAll(checkboxlabel,checkBox1, checkBox2);

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox, HBox, Button e Label");
        primaryStage.setScene(scene);
        primaryStage.show();
        }

        
    }

    public void updateCheckboxLabel(CheckBox cb1, CheckBox cb2, Label label) {
        String selected = "Checkbox selecionadas: ";
        if (cb1.isSelected()) selected += cb1.getText() + " ";
        if (cb2.isSelected()) selected += cb2.getText();
        label.setText(selected);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
