package pattern;

public class SquarePattern {
    public static void main(String[] args) {
        // 1st Pattern
        System.out.println("First Pattern");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("2nd Pattern");
        // 2nd Pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //3rd Pattern
        System.out.println("THIRD PATTERN");

        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
        // 4TH PATTERN
        System.out.println("4TH Pattern");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }

        // 5Th Pattern
        System.out.println("5th Pattern");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("1");

            }
            System.out.println();
        }

        System.out.println("6th Pattern");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

        // 7th Pattern
        System.out.println("Pattern 7th");
//        for (int i = 0; i <= 5 ; i++) {
//            for (int j = 0; j < 5- i + 1; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j < 2 * i + 1 ; j++) {
//                System.out.print("*");
//            }
//            for (int j = 0; j < 5- i; j++) {
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

        for(int i = 0; i < 5; i ++){
            for (int j = 0; j < 5- i; j++) {
                System.out.print("@");
            }
//


//            for (int j = 0; j < 5- 1; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }

        // 9th
        System.out.println("Pattern no 9th");
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print("1");
            }
            for (int j = 0; j < 2 * 5 - (2 * i); j++) {
                System.out.print("*");
            }
//            for (int j = 0; j < i * 2; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
    }
}
