package ch01;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/12/10.
 */
public class DataSourceLoader implements Runnable {

    @Override
    public void run() {
        System.out.printf("Data sources begin loading: %s\n",new Date());
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Data sources loading has finished: %s\n", new Date());

    }
}
