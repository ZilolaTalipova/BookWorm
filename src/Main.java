import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Administration/Admin.fxml"));
        primaryStage.setTitle("Log In BookWorm");
        primaryStage.setScene(new Scene(root, 1366, 768));

        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
