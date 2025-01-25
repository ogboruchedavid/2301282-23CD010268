import java.util.Arrays;

public class MeanMedianStandardDeviation {
    public static void main(String[] args) {
        // Given data array
        int[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Calculate mean
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    // Method to calculate mean
    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    // Method to calculate median
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }

    // Method to calculate standard deviation
    public static double calculateStandardDeviation(int[] arr, double mean) {
        double sumSquaredDifferences = 0;
        for (int num : arr) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / arr.length);
    }
}
