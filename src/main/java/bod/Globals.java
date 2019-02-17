package bod;

import java.util.Random;

public class Globals {
    public static byte isOpened = 1;
    public static Ui_mainWidget ui = new Ui_mainWidget();
    public static int getRandomInt(int from, int to){
        Random rand = new Random();

        return rand.nextInt((to - from) + 1) + from;
    }
}
