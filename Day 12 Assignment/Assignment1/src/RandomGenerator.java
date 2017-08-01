import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by katkhedd on 8/1/2017.
 */
public class RandomGenerator implements Runnable {

LinkedBlockingQueue<Integer> list = null;

    public RandomGenerator(LinkedBlockingQueue<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true) {
        for (int i = 0; i < 100; i++) {

            try {
                list.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
}
