package model;

/**
 * The RowGameMode class.
 */
public class RowGameMode {
    // Constants for game mode options.
    final String HUMAN = "human";
    final String COMPUTER = "computer";
    // Initialization of game mode.
    private String gameMode;
    public RowGameMode(){
        this.gameMode = HUMAN;
    }
    // Setter method for computer game mode.
    public void setComputer(){
        this.gameMode = COMPUTER;
    }
    // Getter method for game mode.
    public String getGameMode(){
        return this.gameMode;
    }
}
