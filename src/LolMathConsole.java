import java.util.Scanner;

public class LolMathConsole {
    public static void main(String[] args) {
        int a;
        int b = 0;

        if(args.length > 0){
            if(args[0].equalsIgnoreCase("-B")){
                League.boost();
                b += 1;
            }else if(args[0].equalsIgnoreCase("--help")){
                System.out.println("usage: java LolMathTester <operation> [level]");
                System.out.println("operations:");
                System.out.println("\tjava LolMathTester{ --help}");
                System.out.println("\tjava LolMathTester{ -B}");
                System.out.println("\tjava LolMathTester{ -b}");
                System.exit(0);
            }
            a = League.TryParseInt32(args[b]);
            if(a > 0) {
                League ln = new League(a);
                System.out.println(ln.LevelMath());
            } else{
                System.out.println("error: invalid option '" + args[0] + "'");
                System.out.println("try --help");
            }
        }else {
            int input;
            String boosty;
            Scanner in = new Scanner(System.in);

            System.out.println("This program is made to make the Process of leveling easier");
            System.out.println("\"Assuming no xp earned in the entered level\"");

            do {
                System.out.print("Do you have active boost:");
                boosty = in.next();
                if(boosty.equalsIgnoreCase("yes")){
                    League.boost();
                }
            }while(!(boosty.equalsIgnoreCase("yes") ||boosty.equalsIgnoreCase("no")));

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
}
