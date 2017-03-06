package demo;

/**
 * Created by smac89 on 05/03/17.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Demo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new GridTilesDemoView().getView());
        primaryStage.setTitle("GridTiles Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
