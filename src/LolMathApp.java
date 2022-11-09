/*
* This is the easiest way to implement this
* A rough draft is better than not trying
* I will 100% change this once I spend the time to learn more about swing
*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LolMathApp {
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 200;
    private static int value = 0;

    public static void main(String[] args)
    {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Increase Value");
        JButton button2 = new JButton("Decrease Value");
        JButton button3 = new JButton("Submit");
        JLabel label = new JLabel("" + value);
        JLabel label2 = new JLabel("");

        // TOD0 Properly format display layout
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(label);
        panel.add(label2);
        frame.add(panel);

        button.addActionListener(e -> {
            value++;
            label.setText(""+ value);
        });

        button2.addActionListener(e -> {
            value--;
            label.setText(""+ value);
        });

        button3.addActionListener(e ->{
            if(value >= 30 || value <= 0){
                label2.setText("Index out of bounds");
            }else{
                League lg = new League(value);
                label2.setText(lg.LevelMath());
            }
        });

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}