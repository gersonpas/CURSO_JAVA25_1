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

        // radio buttons
        RadioButton rb1 = new RadioButton("Radio 1");
        RadioButton rb2 = new RadioButton("Radio 2");
        RadioButton rb3 = new RadioButton("Radio 3");

        ToggleGroup group = new ToggleGroup();
        rb1.setToggleGroup(group);
        rb2.setToggleGroup(group);
        rb3.setToggleGroup(group);

        Label radiolabel = new Label("Radio selecionada");
        

        rb1.setOnAction(event -> updateRadioLabel(group, radiolabel));
        rb2.setOnAction(event -> updateRadioLabel(group, radiolabel));
        rb3.setOnAction(event -> updateRadioLabel(group, radiolabel));

        vbox.getChildren().addAll(radiolabel, rb1, rb2, rb3);

        // Criando uma cena com o layout
        Scene scene = new Scene(vbox, 500, 500);

        // configuração do Stage
        primaryStage.setTitle("Exemplo VBox, HBox, Button e Label");
        primaryStage.setScene(scene);
        primaryStage.show();
        }

        
    }

    private Object updateRadioLabel(ToggleGroup group, Label radiolabel) {
        RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
        if (selectedRadioButton != null) {
            radiolabel.setText("Radio selecionada: " + selectedRadioButton.getText());
        } else {
            radiolabel.setText("Nenhum Radio selecionado");
        }
        return null;
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
