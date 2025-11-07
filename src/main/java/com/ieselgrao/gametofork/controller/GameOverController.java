package com.ieselgrao.gametofork.controller;

import com.ieselgrao.gametofork.MainApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.io.IOException;

public class GameOverController {

    @FXML
    private Label finalScoreLabel;

    @FXML
    public void initialize() {
        // Muestra la puntuación final del modelo de juego
        int finalScore = MainApplication.getGameModel().getScore();
        finalScoreLabel.setText("Puntuación Final: " + finalScore);
    }

    @FXML
    protected void handlePlayAgain() throws IOException {
        MainApplication.switchToGameView();
    }

    @FXML
    protected void handleExit() {
        Platform.exit(); // Cierra la aplicación
    }
}