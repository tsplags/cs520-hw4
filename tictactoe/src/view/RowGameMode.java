package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import model.BlockIndex;
import model.RowGameModel;
import controller.RowGameController;

/**
 * The RowGameMode class.
 */
public class RowGameMode {
    final String HUMAN = "human";
    final String COMPUTER = "computer";
    private String gameMode;
    public RowGameMode(){
        this.gameMode = HUMAN;
    }
    public void setComputer(){
        this.gameMode = COMPUTER;
    }
    public String getGameMode(){
        return this.gameMode;
    }
}
