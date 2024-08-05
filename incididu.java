import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class BottomTrailingExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        
        Label bottomTrailingLabel = new Label("bottomTrailing");
        StackPane bottomTrailingPane = new StackPane(bottomTrailingLabel);
        StackPane.setAlignment(bottomTrailingLabel, Pos.BOTTOM_RIGHT);
        
        borderPane.setBottom(bottomTrailingPane);

        Scene scene = new Scene(borderPane, 400, 200);
        primaryStage.setTitle("JavaFX BottomTrailing Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
