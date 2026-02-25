package helloworldfx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.util.Duration;
import javafx.animation.*;


public class SmoothAnimationExample extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        
         Circle circle = new Circle(50, Color.BLUE);
         Rectangle rectangle = new Rectangle(100, 100, Color.BLUE);
         Polygon hexagon = createHexagon(50, Color.BLUE);

        circle.setTranslateX(-200);
        rectangle.setTranslateX(-200);
        hexagon.setTranslateX(-200);

        Timeline timeline = new Timeline();

        KeyFrame keyframe = new KeyFrame(
            Duration.seconds(2),
            new KeyValue(hexagon.translateXProperty(), 200)
        );

        timeline.getKeyFrames().add(keyframe);

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);

        timeline.play();

        StackPane stack = new StackPane();
        stack.getChildren().add(hexagon);

        // configuração do Stage
        Scene scene = new Scene(stack, 500, 500);

        primaryStage.setTitle("Exemplo de Animação Suave");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private static Polygon createHexagon(double radius, Color color) {
        Polygon hexagon = new Polygon();
        for (int i = 0; i < 6; i++) {
            double angle = 2 * Math.PI * i / 6;
            hexagon.getPoints().addAll(
                radius * Math.cos(angle),
                radius * Math.sin(angle)
            );
        }
        hexagon.setFill(color);
        return hexagon;
    }

    public static void main(String[] args) {
        launch(args);
    }
}