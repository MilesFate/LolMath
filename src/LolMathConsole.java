import java.util.Scanner;

public class LolMathConsole {

    public static void handleConsole() {
        int input;
        String boosts;
        Scanner in = new Scanner(System.in);

        System.out.println("This program is made to make the Process of leveling easier");
        System.out.println("\"Assuming no xp earned in the entered level\"");

        do {
            System.out.print("Do you have active boost:");
            boosts = in.next();
            if(boosts.equalsIgnoreCase("yes")){
                League.boost();
            }
        }while(!(boosts.equalsIgnoreCase("yes") ||boosts.equalsIgnoreCase("no")));

        System.out.println("Enter a number between 1 and 29.");
        System.out.println("-------------------------------------------------");

        do {
            System.out.print("Enter Current Level: ");
            input = League.TryParseInt32(in.next());
            if(input < 0)
                System.out.println("Please enter a number between 1 and 29");
        } while (input < 0);

        League l = new League(input);
        System.out.println(l.LevelMath());

        in.close();
    }
}
