package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    /**
     * @author david collins
     * @version Software Requirements Specification javafx-uml-v1.4
     * @date Feb 5 2023
     *
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/view/staff-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Secure Application Programming");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}