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

    public static void handleApp() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        Container container;

        jFrame.setTitle("League Account Leveling Calculator");
        ImageIcon img = new ImageIcon("src\\icon\\111.png");
        jFrame.setIconImage(img.getImage());

        jFrame.setBounds(300, 90, 600, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = jFrame.getContentPane();
        jFrame.setResizable(false);
        container.setLayout(null);

        JButton Increase = new JButton("Increase Value");
        jButton(Increase,50,200);
        container.add(Increase);

        JButton Decrease = new JButton("Decrease Value");
        jButton(Decrease,200,200);
        container.add(Decrease);

        JButton OnBoost = new JButton("Boost Off");
        jButton(OnBoost,350,200);
        container.add(OnBoost);

        JButton submit = new JButton("Submit");
        jButton(submit,200,230);
        container.add(submit);


        JLabel Num = new JLabel("Level: " + levelValue);
        Num.setFont(new Font("Arial", Font.BOLD, 15));
        Num.setSize(90, 20);
        Num.setLocation(10, 10);
        container.add(Num);

        JLabel Output = new JLabel();
        Output.setFont(new Font("Arial", Font.BOLD, 15));
        Output.setSize(900, 200);
        Output.setLocation(10, 10);
        container.add(Output);



        jFrame.add(jPanel);
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
            Num.setText("Level: " + levelValue);
        });

        Decrease.addActionListener(e -> {
            levelValue--;
            if(levelValue <= 0) {
                levelValue = 1;
            }
            Num.setText("Level: " + levelValue);
        });

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

    private static void jButton(JButton button, int x, int y){
        button.setFont(new Font("Arial", Font.PLAIN, 15));
        button.setSize(140, 20);
        button.setLocation(x, y);
    }

}