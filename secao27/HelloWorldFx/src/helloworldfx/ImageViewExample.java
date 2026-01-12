package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class ImageViewExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
        Image image = new Image("file:C:\\Users\\Gerson PAS\\Downloads\\image.png");
        
        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(200);
        imageView.setFitHeight(300);
        imageView.setPreserveRatio(true);

        VBox vbox = new VBox(10);

        vbox.getChildren().addAll(imageView);

        // configuração do Stage
        Scene scene = new Scene(vbox, 500, 500);

        primaryStage.setTitle("Exemplo de ImageView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

