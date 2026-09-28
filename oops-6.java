import java.util.*;

class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100)
                throw new Exception();

            System.out.println("Valid marks.");
        } catch (Exception e) {
            System.out.println("Invalid marks.");
        }
    }
}