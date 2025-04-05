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
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void handleApp() {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        Container container;

        //JLabel myHeaderImage = new JLabel(new ImageIcon(LolMathApp.class.getResource("src\\icon\\111.png")));
        jFrame.setTitle("League Account Leveling Calculator");

        jFrame.setBounds(300, 90, 600, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = jFrame.getContentPane();
        jFrame.setResizable(false);
        container.setLayout(null);

        JButton OnBoost = new JButton("Boost Off");
        jButton(OnBoost,350,200);
        container.add(OnBoost);

        JButton submit = new JButton("Submit");
        jButton(submit,200,200);
        container.add(submit);

        String[] levels
                = { "1", "2", "3", "4", "5",
                "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15",
                "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25",
                "26", "27", "28", "29", };
        JComboBox level = new JComboBox(levels);
        level.setFont(new Font("Arial", Font.BOLD, 15));
        level.setSize(90, 20);
        level.setLocation(90, 10);
        container.add(level);


        JLabel Num = new JLabel("Level: ");
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


        submit.addActionListener(e ->{
            levelValue = League.TryParseInt32((String) level.getSelectedItem());
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
