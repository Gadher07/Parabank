package util;

import org.junit.experimental.theories.internal.BooleanSupplier;

import java.util.concurrent.TimeUnit;

public class WaitUtils {
    private static long DEFAULT_RETRY_INTERVAL_MS=2000;

    private static void waitForRetry(Long ms){
        try{
            Thread.sleep(ms);
        }
        catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public static <Z> Boolean waitUnitCondition(boolean condition, int timeout) {
        boolean result =!condition;
        long timeOutInMinllis = TimeUnit.SECONDS.toMillis(timeout);
        long start  = System.currentTimeMillis();

        while ((System.currentTimeMillis()-start)< timeOutInMinllis){
            waitForRetry(DEFAULT_RETRY_INTERVAL_MS);
                    }
                    return result;
    }
}
