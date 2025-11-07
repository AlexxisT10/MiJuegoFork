package com.ieselgrao.gametofork.controller;

import com.ieselgrao.gametofork.MainApplication;
import javafx.fxml.FXML;
import java.io.IOException;

public class StartController {

    @FXML
    protected void handleStartGame() throws IOException {
        MainApplication.switchToGameView();
    }
}