package util;

public class WaitUntil {
    public static void waitUntilTime(int time){
        try{
            Thread.sleep(time);
                  } catch ( InterruptedException e) {
            e.printStackTrace();
        }
    }
}
