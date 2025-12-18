package helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class StageSceneExample extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Criar botao e cena
        Button btn = new Button();
        btn.setText("Clique aqui");

        // Criar layout e adicionar botao
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        // Criar cena
        Scene scene = new Scene(root, 500, 500);

        Parent root = FXMLLoader.load(getClass().getResource("helloworldfx.fxml"));
        primaryStage.setTitle("Exemplo de Stage e Scene");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}


