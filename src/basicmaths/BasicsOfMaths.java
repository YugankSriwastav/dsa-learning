package basicmaths;

import java.util.Scanner;

import static java.lang.Math.log;

public class BasicsOfMaths {
    // Count Number using (extract number)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int value = extractNumber(number);
        System.out.println(value);
        double v = log(number);
        System.out.println("log value" + v);

    }

    private static int extractNumber(int number) {
        int count = 0;
        while(number > 0){
            int reminder = number % 10;
            number = number / 10;
            count ++;
        }
        return count;
    }
    }

