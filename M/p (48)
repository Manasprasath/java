import java.io.*;
import java.util.*;

public class MeanMedianMode {
    public static double getMean(int[] arr) {    
        double mean = 0;
        for (int i = 0; i < arr.length; i++)
            mean += arr[i];
        mean /= arr.length;

        return mean;
    }

    public static double getMedian(int[] arr) {
        int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        double median = 0;
        int n = arrCopy.length;

        if (n % 2 == 1) {
            median = arrCopy[n / 2];
        } else {
            median = (arrCopy[n / 2] + arrCopy[n / 2 - 1]) / 2.0;
        }

        return median;
    }

    public static double getMode(int[] arr) {    
        int[] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        
        Map<Integer, Integer> freq = new TreeMap<>();
        for (int i : arrCopy) {
            if (!freq.containsKey(i))
                freq.put(i, 1);
            else
                freq.put(i, freq.get(i) + 1);
        }

        double mode = arrCopy[0];
        int maxFreq = 1;

        for (Map.Entry<Integer, Integer> me : freq.entrySet()) {
            if (me.getValue() > maxFreq) {
                maxFreq = me.getValue();
                mode = me.getKey();
            }
        }

        return mode;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        String[] Xs = S.split(" ");
        int[] X = new int[N];

        for (int i = 0; i < N; i++)
            X[i] = Integer.parseInt(Xs[i]);

        double mean = getMean(X);
        double median = getMedian(X);
        double mode = getMode(X);

        System.out.printf("Mean: %.2f\n", mean);
        System.out.printf("Median: %.2f\n", median);
        System.out.printf("Mode: %.2f\n", mode);

        sc.close();
    }
}
