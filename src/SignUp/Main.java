package SignUp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        primaryStage.setTitle("Log In BookWorm");
        primaryStage.setScene(new Scene(root, 950, 630));
        Button LogIn =new Button("Log In");

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
