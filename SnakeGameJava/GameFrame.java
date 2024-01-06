package SnakeGameJava;
import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame(){
        GamePanel panel = new GamePanel();
        this.add(panel);

        // set the title
        this.setTitle("Snake");
        
        // closes game
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // resize the window
        this.setResizable(false);
        
        this.pack();

        // see the window
        this.setVisible(true);

        // this makes the window appear in the middle of the screen
        this.setLocationRelativeTo(null);
    }
}
