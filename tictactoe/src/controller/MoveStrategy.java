package controller;

import model.BlockIndex;;

/**
 * The View interfaces supports updating the visualizations of the Model.
 *
 * NOTE) For the Composite design pattern, the View interface is the Component interface.
 */
public interface MoveStrategy
{
    public void move(RowGameController controller, BlockIndex blockIndex);
}
