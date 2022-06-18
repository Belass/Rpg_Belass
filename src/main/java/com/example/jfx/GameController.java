package com.example.jfx;

import com.example.rpg.hal.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController {

    private Scene scene;
    private Stage stage;
    private Parent root;


    @FXML
    ListView<String> heroList;
    @FXML
    ListView<String> enemyList;
    @FXML
    Button fightButton;

    @FXML
    Button menuButton;

    // "initialize()" est appelé par JavaFX à l'affichage de la fenêtre
    @FXML
    public void initialize() {
        Game.playGame();
        updateListViews();
        updateFightButton();
    }

    private void updateListViews() {
        heroList.getItems().setAll(Game.context.getHeroesStatus());
        enemyList.getItems().setAll(Game.context.getEnemiesStatus());
    }

    // L'action du bouton change en fonction de l'état du jeu
    private void updateFightButton() {
        switch (Game.context.status) {
            case START_COMBAT:
                fightButton.setText("Lancer le combat !");
                fightButton.setOnAction( event -> {
                    updateListViews();
                    Game.context.startNextFighterTurn();
                    updateFightButton();
                    } );
                break;
            case HERO_TURN:
                fightButton.setText("Attaque du héro...");
                fightButton.setOnAction( event -> {
                    Game.context.startHeroTurn();
                    updateListViews();
                    Game.context.startNextFighterTurn();
                    updateFightButton();
                    } );
                break;
            case ENEMY_TURN:
                fightButton.setText("Attaque de l'ennemi...");
                fightButton.setOnAction( event -> {
                    Game.context.startEnemyTurn();
                    updateListViews();
                    Game.context.startNextFighterTurn();
                    updateFightButton();
                    } );
                break;
            case END_GAME:
                fightButton.setDisable(true);
                break;
        }
    }



}
