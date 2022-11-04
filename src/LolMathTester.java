import java.util.Scanner;

public class LolMathTester {
    public static void main(String[] args) {
        int input;

        if(args.length > 0){
            int a = League.TryParseInt32(args[0]);
            if(a > 0) {
                League ln = new League(a);
                System.out.println(ln.LevelMath());
            } else{
                System.out.println("Invalid input!");
                System.out.println("Format Command : java LolMathTester [level]");
                System.out.println("Example : java LolMathTester 12");
            }
        }else {
            Scanner in = new Scanner(System.in);

            System.out.println("This program is made to make the Process of leveling easier");
            System.out.println("\"Assuming no xp earned in the entered level\"");
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
