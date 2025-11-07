package com.ieselgrao.gametofork;

import com.ieselgrao.gametofork.model.GameModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    private static Stage primaryStage;
    private static GameModel gameModel; // Estado del juego compartido

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        gameModel = new GameModel(); // Inicializa el modelo de juego
        stage.setTitle("Círculos en Caída");
        stage.setResizable(false);

        switchToStartView();
        stage.show();
    }

    public static void switchToStartView() throws IOException {
        loadScene("start-view.fxml", 600, 600);
    }

    public static void switchToGameView() throws IOException {
        gameModel.resetGame(); // Reinicia el estado del juego
        loadScene("game-view.fxml", 600, 600);
    }

    public static void switchToGameOverView() throws IOException {
        loadScene("game-over-view.fxml", 600, 600);
    }

    private static void loadScene(String fxmlFile, double width, double height) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource(fxmlFile));
        Scene scene = new Scene(fxmlLoader.load(), width, height);
        primaryStage.setScene(scene);
    }

    public static GameModel getGameModel() {
        return gameModel;
    }

    public static void main(String[] args) {
        launch();
    }
}