package ch01;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/10.
 */
public class NetworkConnectionLoader implements Runnable {
    @Override
    public void run() {
        System.out.printf("Network begin loading: %s\n",new Date());
        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Network loading has finished: %s\n", new Date());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new DataSourceLoader(), "DataSourceLoader");
        Thread thread1 = new Thread(new NetworkConnectionLoader(), "NetworkLoader");
        thread.start();
        thread1.start();
        try {
            thread1.join();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Main : Configuration has been loaded %s\n", new Date());
    }
}
