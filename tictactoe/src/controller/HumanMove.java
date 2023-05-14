package controller;

import model.BlockIndex;

public class HumanMove implements MoveStrategy {

    public void move(RowGameController controller, BlockIndex blockIndex) {
        controller.manipulateAfterMove(blockIndex);
    }
}