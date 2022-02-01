package SampleCodes.Java2D.Transparency;

import javax.swing.*;
import java.awt.*;

class Surface extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setPaint(Color.blue);
        for (int i = 1; i <= 10; i++) {
            //In our example we draw 10 blue rectangles with various levels of transparency applied.
            float alpha = i * 0.1f;
            //The alpha value dynamically changes in the for loop.
            AlphaComposite alcom = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha);
            //The AlphaComposite.getInstance() method creates an AlphaComposite object with the specified rule and the constant alpha to multiply with the alpha of the source.
            //The setComposite() method sets the composite attribute for the Graphics2D object.
            g2d.setComposite(alcom);
            g2d.fillRect(50 * i, 20, 40, 40);
        }
        g2d.dispose();
    }
}

public class TransparentRectanglesEx extends JFrame {

    public TransparentRectanglesEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Transparent rectangles");
        setSize(590, 120);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TransparentRectanglesEx ex = new TransparentRectanglesEx();
                ex.setVisible(true);
            }
        });
    }
}
