public class LolMathMain {
    public static void main(String[] args) {
        // change this to try different versions

        int type = 3;

        if(args.length > 0){
            LolMathCommandLine.handleCommandLine(args);
            type = 0;
        }
        if(type == 1)
            LolMathConsole.handleConsole();
        else if (type == 3) {
            LolMathApp.handleApp();
        }
    }
}
