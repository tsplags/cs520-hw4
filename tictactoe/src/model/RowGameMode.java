package model;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

import model.BlockIndex;
import model.RowGameModel;
import model.Player;
import view.RowGameGUI;
import controller.RowGameController;

/**
 * The RowGameMode class.
 */
public class RowGameMode {
    // Constants for game mode options.
    final String HUMAN = "human";
    final String COMPUTER = "computer";
    // Initialization of game mode.
    private String gmMode;
    public RowGameMode(){
        this.gmMode = HUMAN;
    }
    // Setter method for computer game mode.
    public void setComputer(){
        this.gmMode = COMPUTER;
    }
    // Getter method for game mode.
    public String getGameMode(){
        return this.gmMode;
    }
}
