package com.ieselgrao.gametofork.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class GameModel {

    // Usamos Properties para que las etiquetas de la UI se actualicen automáticamente
    private final IntegerProperty score = new SimpleIntegerProperty(0);
    private final IntegerProperty lives = new SimpleIntegerProperty(3);
    private static final int MAX_LIVES = 3;

    public int getScore() { return score.get(); }
    public IntegerProperty scoreProperty() { return score; }

    public int getLives() { return lives.get(); }
    public IntegerProperty livesProperty() { return lives; }

    public boolean isGameOver() { return lives.get() <= 0; }

    public void addScore(int points) {
        score.set(score.get() + points);
    }

    public void loseLife() {
        if (lives.get() > 0) {
            lives.set(lives.get() - 1);
        }
    }

    public void resetGame() {
        score.set(0);
        lives.set(MAX_LIVES);
    }
}