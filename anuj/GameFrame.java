import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("car driving and crashing");
        setSize(287,640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel gamePanel = new GamePanel();
        add(gamePanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}