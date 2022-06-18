package com.example.rpg;

import com.example.jfx.MainApplication;
import com.example.rpg.Character.*;
import com.example.rpg.hal.Game;
import com.example.utils.InputParser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import static com.example.rpg.hal.Game.*;

public class MainController {

    @FXML
    Button startButton;

    @FXML
    Button menuButton;

    @FXML
    RadioButton oneWarrior;

    @FXML
    RadioButton twoWarriors;

    @FXML
    RadioButton oneHealer;

    @FXML
    RadioButton twoHealers;

    @FXML
    RadioButton oneMage;

    @FXML
    RadioButton twoMages;

    @FXML
    RadioButton oneHunter;

    @FXML
    RadioButton twoHunters;

    @FXML
    Button goToFightButton;

    @FXML
    ListView herolist;


    private Scene scene;
    private Stage stage;
    private Parent root;


    @FXML
    private void selectPlayer(ActionEvent event) throws IOException {
        root = FXMLLoader.load((getClass().getResource("select_player.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void backtoMenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load((getClass().getResource("menu.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    boolean warrior1 = false;
    boolean warrior2 = false;
    boolean warrior3 = false;
    boolean healer1 = false;
    boolean healer2 = false;
    boolean healer3 = false;
    boolean mage1 = false;
    boolean mage2 = false;
    boolean mage3 = false;
    boolean hunter1 = false;
    boolean hunter2 = false;
    boolean hunter3 = false;

    @FXML
    private void addoneWarrior(ActionEvent event) {
        warrior1 = true;
        warrior2 = false;
        warrior3 = false;
    }

    @FXML
    private void addtwoWarriors(ActionEvent event) {
        warrior1 = false;
        warrior2 = true;
        warrior3 = false;
    }

    @FXML
    private void addthreeWarriors(ActionEvent event) {
        warrior1 = false;
        warrior2 = false;
        warrior3 = true;
    }

    @FXML
    private void addoneHealer(ActionEvent event) {
        healer1 = true;
        healer2 = false;
        healer3 = false;
    }

    @FXML
    private void addtwoHealers(ActionEvent event) {
        healer1 = false;
        healer2 = true;
        healer3 = false;
    }

    @FXML
    private void addthreeHealers(ActionEvent event) {
        healer1 = false;
        healer2 = false;
        healer3 = true;
    }

    @FXML
    private void addoneMage(ActionEvent event) {
        mage1 = true;
        mage2 = false;
        mage3 = false ;
    }

    @FXML
    private void addtwoMages(ActionEvent event) {
        mage1 = false;
        mage2 = true;
        mage3 = false;
    }

    @FXML
    private void addthreeMages(ActionEvent event) {
        mage1 = false;
        mage2 = false;
        mage3 = true ;
    }

    @FXML
    private void addoneHunter(ActionEvent event) {
        hunter1 = true;
        hunter2 = false;
        hunter3 = false;
    }

    @FXML
    private void addtwoHunters(ActionEvent event) {
        hunter1 = false;
        hunter2 = true;
        hunter3 = false;
    }

    @FXML
    private void addthreeHunters(ActionEvent event) {
        hunter1 = false;
        hunter2 = false;
        hunter3 = true;
    }


    @FXML
    private void setGoToFightButton(ActionEvent event) throws IOException {
        if (warrior1 == true) {
            Hero warrior = new Warrior("Warrior");
            heroes.add(warrior);
        }
        ;

        if (warrior2 == true) {
            Hero warriorN1 = new Warrior("Warrior 1");
            heroes.add(warriorN1);
            Hero warriorN2 = new Warrior("Warrior 2");
            heroes.add(warriorN2);
        }
        ;

        if (warrior3 == true) {
            Hero warriorN1 = new Warrior("Warrior 1");
            heroes.add(warriorN1);
            Hero warriorN2 = new Warrior("Warrior 2");
            heroes.add(warriorN2);
            Hero warriorN3 = new Warrior("Warrior 3");
            heroes.add(warriorN3);

        }
        ;

        if (healer1 == true) {
            Hero healer = new Healer("Healer");
            heroes.add(healer);
        }
        ;

        if (healer2 == true) {
            Hero healerN1 = new Healer("Healer 1");
            heroes.add(healerN1);
            Hero healerN2 = new Healer("Healer 2");
            heroes.add(healerN2);
        }
        ;

        if (healer3 == true) {
            Hero healerN1 = new Healer("Healer 1");
            heroes.add(healerN1);
            Hero healerN2 = new Healer("Healer 2");
            heroes.add(healerN2);
            Hero healerN3 = new Healer("Healer 3");
            heroes.add(healerN3);

        }
        ;

        if (mage1 == true) {
            Hero mage = new Mage("Mage");
            heroes.add(mage);
        }
        ;

        if (mage2 == true) {
            Hero mageN1 = new Mage("Mage 1");
            heroes.add(mageN1);
            Hero mageN2 = new Mage("Mage 2");
            heroes.add(mageN2);
        }
        ;
        if (mage3 == true) {
            Hero mageN1 = new Mage("Mage 1");
            heroes.add(mageN1);
            Hero mageN2 = new Mage("Mage 2");
            heroes.add(mageN2);
            Hero mageN3 = new Mage("Mage 3");
            heroes.add(mageN3);
        }
        ;

        if (hunter1 == true) {
            Hero hunter = new Hunter("Hunter");
            heroes.add(hunter);
        }
        ;

        if (hunter2 == true) {
            Hero hunterN1 = new Hunter("Hunter 1");
            heroes.add(hunterN1);
            Hero hunterN2 = new Hunter("Hunter 2");
            heroes.add(hunterN2);
        }

        if (hunter3 == true) {
            Hero hunterN1 = new Hunter("Hunter 1");
            heroes.add(hunterN1);
            Hero hunterN2 = new Hunter("Hunter 2");
            heroes.add(hunterN2);
            Hero hunterN3 = new Hunter("Hunter 3");
            heroes.add(hunterN3);
        }

            root = FXMLLoader.load((getClass().getResource("game-view.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            for (int i=0; i<heroes.size();i++){
            BasicEnemy enemy = new BasicEnemy();
            enemies.add(enemy);
            fighters.addAll(enemies);
            fighters.addAll(heroes);
            Collections.shuffle(fighters);



        }

    }

    @FXML
    private void startFight(){






        }


    }













