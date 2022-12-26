/*
* This is the easiest way to implement this
* A rough draft is better than not trying
* I will 100% change this once I spend the time to learn more about swing
*/

import javax.swing.*;

public class LolMathApp {
    private static int levelValue = 0;

    public static void main(String[] args)
    {
        final int FrameWidth = 500;
        final int FrameHeight = 200;
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        jFrame.setSize(FrameWidth, FrameHeight);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

        JButton Increase = new JButton("Increase Value");
        JButton Decrease = new JButton("Decrease Value");
        JButton submit = new JButton("Submit");
        JLabel Num = new JLabel(String.valueOf(levelValue));
        JLabel WhiteSpace = new JLabel("    "); // this is dumb but works
        JLabel Output = new JLabel();

        // TOD0 Properly format display layout
        jPanel.add(Num);
        jPanel.add(Increase);
        jPanel.add(Decrease);
        jPanel.add(submit);
        jPanel.add(WhiteSpace); // this is dumb but works
        jPanel.add(Output);
        jFrame.add(jPanel);

        // learned about these in class and now I wanna use them here
        // for sure not the main reason I even added this file ^_^
        Increase.addActionListener(e -> {
            levelValue++;
            Num.setText(String.valueOf(levelValue));
        });

        Decrease.addActionListener(e -> {
            levelValue--;
            Num.setText(String.valueOf(levelValue));
        });

        submit.addActionListener(e ->{
            if(levelValue >= 30 || levelValue <= 0){
                Output.setText("Index out of bounds");
            }else{
                League lg = new League(levelValue);
                Output.setText(lg.LevelMath());
            }
        });

    }
}