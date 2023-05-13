package view;

import controller.RowGameController;
import model.RowGameModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PlayerSelectionViewController implements View
{
    private JButton computer;

    
    public PlayerSelectionViewController(JPanel parent, RowGameController controller) {
	super();

    this.computer = new JButton("Computer Opponent");
    parent.add(this.computer);

	// This is the Controller aspect.
    this.computer.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            controller.undo();
       }
        });
    }

    public void update(RowGameModel model) {
	// This is the View aspect.
	//
	// In the initial configuration, choosing an opponent is allowed
	if (model.movesLeft == 9) {
        this.computer.setEnabled(true);
	}
	// If not the above, choosing an opponent is not allowed
	else {
        this.computer.setEnabled(false);
	}
    }
}
