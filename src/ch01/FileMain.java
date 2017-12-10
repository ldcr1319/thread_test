package ch01;

import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/10.
 */
public class FileMain {
    public static void main(String[] args) {
        FileClock fileClock =new FileClock();
        Thread thread = new Thread(fileClock);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

    }
}
