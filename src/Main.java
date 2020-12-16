import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StopWacth stopWacth=new StopWacth();
        stopWacth.start();
        int[]arr=new int[200000];
        for (int i = 0; i < 200000; i++) {
            arr[i]=i+1;

        }
        Arrays.sort(arr);
        stopWacth.stop();
        System.out.println(stopWacth.getElapsedTime());
    }
}
