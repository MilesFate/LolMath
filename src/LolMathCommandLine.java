public class LolMathCommandLine {
    public static void handleCommandLine(String[] args) {
        int a;
        int b = 0;
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
    }
}
