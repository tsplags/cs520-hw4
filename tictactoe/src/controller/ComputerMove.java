package controller;

import model.BlockIndex;

public class ComputerMove implements MoveStrategy {

    public void move(RowGameController controller, BlockIndex blockIndex) {
        controller.manipulateAfterMove(blockIndex);
        BlockIndex newMove = new BlockIndex(0, 0);
        outerloop:
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (controller.gameModel.blocksData[i][j].getIsLegalMove() == true) {
                    newMove = new BlockIndex(i, j);
                    break outerloop;
                }
            }
        }
        controller.manipulateAfterMove(newMove);
    }
}