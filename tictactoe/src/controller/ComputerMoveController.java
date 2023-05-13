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

public class ComputerMoveController extends RowGameController {

    public ComputerMoveController() {
        int element = 0;
    }
    @Override
    public void move(BlockIndex blockIndex){
        manipulateAfterMove(blockIndex);
        BlockIndex newMove = new BlockIndex(0, 0);
        outerloop:
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (gameModel.blocksData[i][j].getIsLegalMove() == true) {
                    newMove = new BlockIndex(i, j);
                    break outerloop;
                }
            }
        }
        manipulateAfterMove(newMove);
    }
}