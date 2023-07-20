package SnakeGameJava;
import javax.swing.JFrame;

public class GameFrame extends JFrame {


    // Constructor
    GameFrame(){

        // CREATING AN INSTANCE OF OUR GAME PANEL and using JFrame's methods
        GamePanel panel = new GamePanel();
        this.add(panel); // we use this to add the visual components to our game

        // set the title
        this.setTitle("Snake");
        
        // closes game when we press close
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this would allow us to resize the window
        this.setResizable(false);
        
        //allows us to use other components around just Jframe
        this.pack();

        // this allows us to see the window
        this.setVisible(true);

        // this makes the window appear in the middle of the screen
        this.setLocationRelativeTo(null);

    }

    
}
