import javax.swing.*;

public class FlappyBird {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flappy Bird");
        GamePanel gamePanel = new GamePanel();

        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Game window size
        frame.setResizable(false);
        frame.setVisible(true);

        gamePanel.startGame(); // Start the game
    }
}
