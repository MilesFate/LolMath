/*
* This is the easiest way to implement this
* A rough draft is better than not trying
* I will 100% change this once I spend the time to learn more about swing
*/

import javax.swing.*;

public class LolMathApp {
    private static int value = 0;

    public static void main(String[] args)
    {
        final int FrameWidth = 500;
        final int FrameHeight = 200;
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(FrameWidth, FrameHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton Increase = new JButton("Increase Value");
        JButton Decrease = new JButton("Decrease Value");
        JButton submit = new JButton("Submit");
        JLabel Num = new JLabel(String.valueOf(value));
        JLabel Output = new JLabel();

        // TOD0 Properly format display layout
        panel.add(Num);
        panel.add(Increase);
        panel.add(Decrease);
        panel.add(submit);
        panel.add(Output);
        frame.add(panel);

        Increase.addActionListener(e -> {
            value++;
            Num.setText(String.valueOf(value));
        });

        Decrease.addActionListener(e -> {
            value--;
            Num.setText(String.valueOf(value));
        });

        submit.addActionListener(e ->{
            if(value >= 30 || value <= 0){
                Output.setText("Index out of bounds");
            }else{
                League lg = new League(value);
                Output.setText(lg.LevelMath());
            }
        });


    }
}