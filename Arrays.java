import java.util.Scanner;
import java.util.Arrays;

public class Arrays {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int [] numbers = new int [10];
        for (int i = 0; i < numbers.length; i++){
            System.out.print("index" + i + ":");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("You entered :");
        for (int number : numbers){
            System.out.println(number);
        }

    }
}
