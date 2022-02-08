import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int lastOne = 1;
        int secondLast = 0;
        int sum = 0;
        System.out.println(secondLast + "\t" + lastOne + "\t");
        while (sum < range) {
            sum = lastOne + secondLast;
            if (sum <= range) {
                System.out.println(sum + "\t");
                secondLast = lastOne;
                lastOne = sum;
            } else
                break;

        }
    }


}

