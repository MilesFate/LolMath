/*
* This is the easiest way to implement this
* A rough draft is better than not trying
* I will 100% change this once I spend the time to learn more about swing
* FOSS be D.A.M.N.ed
*/

import javax.swing.*;
import java.awt.*;
public class LolMathApp {
    private static int levelValue = 1;
    private static boolean boost = false;

    public static void main(String[] args)
    {
        final int FrameWidth = 500;
        final int FrameHeight = 200;
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();

        jFrame.setSize(FrameWidth, FrameHeight);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton Increase = new JButton("Increase Value");
        JButton Decrease = new JButton("Decrease Value");
        JButton OnBoost = new JButton("Boost Off");
        JButton submit = new JButton("Submit");
        JLabel Num = new JLabel(String.valueOf(levelValue));
        JLabel WhiteSpace = new JLabel("    "); // this is dumb but works
        JLabel Output = new JLabel();

        jFrame.setLayout(new BorderLayout());

        // TOD0 Properly format display layout
        jPanel.add(Num);
        jPanel.add(OnBoost);
        jPanel.add(Increase);
        jPanel.add(Decrease);
        jPanel.add(submit);
        jPanel.add(WhiteSpace); // this is dumb but works
        jPanel.add(Output);
        jFrame.add(jPanel);


        // learned about these in class and now I wanna use them here
        // for sure not the main reason I even added this file ^_^
        // Its been months since that last comment, I really dislike these
        OnBoost.addActionListener(e -> {

            if(boost){
                boost = false;
                OnBoost.setText("Boost Off");
            }else{
                boost = true;
                OnBoost.setText("Boost On");
            }
        });

        Increase.addActionListener(e -> {
            levelValue++;
            if(levelValue >= 30) {
                levelValue = 29;
            }
            Num.setText(String.valueOf(levelValue));
        });

        Decrease.addActionListener(e -> {
            levelValue--;
            if(levelValue <= 0) {
                levelValue = 1;
            }
            Num.setText(String.valueOf(levelValue));
        });

        // this one thing helped me find a bug so that was nice to solve
        // after a few hours : D
        submit.addActionListener(e ->{
            if(levelValue >= 30 || levelValue <= 0){
                Output.setText("Index out of bounds");
            }else if(boost){
                League.boost();
                League lg = new League(levelValue);
                Output.setText(lg.LevelMath());
            }else {
                League.offBoost();
                League lg = new League(levelValue);
                Output.setText(lg.LevelMath());
            }
        });

        jFrame.setVisible(true);
    }
}