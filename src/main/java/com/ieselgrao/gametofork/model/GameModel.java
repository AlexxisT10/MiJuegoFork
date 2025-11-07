package com.ieselgrao.gametofork.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class GameModel {

    // Usamos Properties para que las etiquetas de la UI se actualicen automáticamente
    private final IntegerProperty score = new SimpleIntegerProperty(0);
    private final IntegerProperty lives = new SimpleIntegerProperty(3);
    private static final int MAX_LIVES = 3;

    // 🆕 NUEVO: Contador de bonus
    private final IntegerProperty bonus = new SimpleIntegerProperty(0);


    public int getScore() {
        return score.get();
    }

    public IntegerProperty scoreProperty() {
        return score;
    }

    public int getLives() {
        return lives.get();
    }

    public IntegerProperty livesProperty() {
        return lives;
    }

    // 🆕 NUEVO: getters del bonus
    public int getBonus() {
        return bonus.get();
    }

    public IntegerProperty bonusProperty() {
        return bonus;
    }

    public boolean isGameOver() {
        return lives.get() <= 0;
    }

    public void addScore(int points) {
        score.set(score.get() + points);
        // 🆕 Por cada 200 puntos, ganas un bonus
        if (score.get() % 200 == 0) {
            addBonus(10);
        }
    }

    // 🆕 Método nuevo
    public void addBonus(int points) {
        score.set(score.get() + points); // suma puntos al marcador
        bonus.set(bonus.get() + 1);      // también incrementa el contador de bonus
    }


    public void loseLife() {
        if (lives.get() > 0) {
            lives.set(lives.get() - 1);
        }
    }

    public void extraLife() {
        if (lives.get() < MAX_LIVES) {
            lives.set(lives.get() + 1);
        }
    }

    public void resetGame() {
        score.set(0);
        lives.set(MAX_LIVES);
        bonus.set(0); //  Reinicia bonus también
    }
}