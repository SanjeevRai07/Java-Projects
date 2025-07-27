import java.awt.*;
import javax.swing.*;

public class Doremon extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Enable 2D graphics
        Graphics2D g2 = (Graphics2D) g;

        // Head
        g.setColor(Color.BLUE);
        g.fillOval(100, 50, 300, 300);  // Head circle

        // Face
        g.setColor(Color.WHITE);
        g.fillOval(140, 100, 220, 220); // White face area

        // Eyes
        g.setColor(Color.WHITE);
        g.fillOval(180, 120, 40, 60);   // Left eye
        g.fillOval(230, 120, 40, 60);   // Right eye

        g.setColor(Color.BLACK);
        g.fillOval(195, 150, 10, 15);   // Left pupil
        g.fillOval(245, 150, 10, 15);   // Right pupil

        // Nose
        g.setColor(Color.RED);
        g.fillOval(215, 170, 20, 20);   // Nose

        // Mouth
        g.setColor(Color.BLACK);
        g.drawArc(180, 180, 100, 80, 0, -180);  // Smile

        // Whiskers
        g.drawLine(130, 180, 190, 180); // Left 1
        g.drawLine(130, 190, 190, 190); // Left 2
        g.drawLine(130, 200, 190, 200); // Left 3

        g.drawLine(310, 180, 250, 180); // Right 1
        g.drawLine(310, 190, 250, 190); // Right 2
        g.drawLine(310, 200, 250, 200); // Right 3

        // Bell
        g.setColor(Color.YELLOW);
        g.fillOval(210, 270, 40, 40);   // Bell

        g.setColor(Color.BLACK);
        g.drawLine(230, 280, 230, 300); // Bell Line
        g.fillOval(225, 295, 10, 10);   // Bell button
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Doraemon Drawing - Java AWT");
        DoraemonDrawing panel = new DoraemonDrawing();

        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
