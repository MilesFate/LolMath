public class League{

    private static int level;

    public League(int value){
        level = value;
    }

    private static int LvlChecker() {
        int num = 0;
        switch (level) {
            case 1  -> num += 0;
            case 2  -> num += 144;
            case 3  -> num += 288;
            case 4  -> num += 480;
            case 5  -> num += 720;
            case 6  -> num += 1056;
            case 7  -> num += 1488;
            case 8  -> num += 2016;
            case 9  -> num += 2640;
            case 10 -> num += 3360;
            case 11 -> num += 4176;
            case 12 -> num += 5088;
            case 13 -> num += 6072;
            case 14 -> num += 7128;
            case 15 -> num += 8256;
            case 16 -> num += 9600;
            case 17 -> num += 11040;
            case 18 -> num += 12576;
            case 19 -> num += 14256;
            case 20 -> num += 16080;
            case 21 -> num += 18048;
            case 22 -> num += 20160;
            case 23 -> num += 22368;
            case 24 -> num += 24672;
            case 25 -> num += 27120;
            case 26 -> num += 29616;
            case 27 -> num += 32112;
            case 28 -> num += 34704;
            case 29 -> num += 37392;
        }
        if(num > 19)
            num = (int)(num * .80);
        return num;
    }

    public String LevelMath() {
        int num = LvlChecker();
        int xpTo30 = 39382;
        int NeededGames = (xpTo30 - num) / 96;
        int time = ( NeededGames * 20) / 60;
        return String.format("The number of games until Level 30 is about %d. \nTime required is %d hours.",NeededGames,time);
    }

    public static int TryParseInt32(String x){
        try {
            return Integer.parseInt(x);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
