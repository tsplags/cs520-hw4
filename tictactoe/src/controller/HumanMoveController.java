package controller;

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
import model.RowGameMode;

public class HumanMoveController extends RowGameController {

    public HumanMoveController() {
        int element = 0;
    }
    @Override
    public void move(BlockIndex blockIndex) {
        manipulateAfterMove(blockIndex);
    }
}