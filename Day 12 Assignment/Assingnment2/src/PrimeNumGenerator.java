import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.concurrent.*;

/**
 * Created by katkhedd on 8/1/2017.
 */
public class PrimeNumGenerator{

    public static void main(String[] args) {

        //PrimeNumTaskA primeTaskA = new PrimeNumTaskA(1,100);
        ExecutorService executor = Executors.newCachedThreadPool();

        Future<Integer> future[] = new Future[5];
        future[0] = executor.submit(new PrimeNumTaskA(3,100));
        future[1] = executor.submit(new PrimeNumTaskA(101,200));
        future[2] = executor.submit(new PrimeNumTaskA(201,300));
        future[3] = executor.submit(new PrimeNumTaskA(301,400));
        future[4] = executor.submit(new PrimeNumTaskA(401,500));


        for (int i = 0; i < future.length ; i++) {

            int result;

            try {
                result = future[i].get();
                System.out.println("Sum : " + result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }
    }

}
class PrimeNumTaskA implements Callable {

    int max,min;

    public PrimeNumTaskA(int max, int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Integer call() {

        boolean flag = false;
        int sum = 0;
        for (int j = min; j <= max; j = j + 2) {

            flag = false;

            for (int i = 2; i <= j / 2; i++) {


                if ((j % i) == 0) {
                    flag = true;
                    break;

                }

            }
            if (flag == false) {

                sum = sum + j;

            }
            System.out.println("SUM : " + sum);

        }
        return sum;
    }
}

