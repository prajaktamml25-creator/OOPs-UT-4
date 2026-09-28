import java.util.*;

class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int age = sc.nextInt();

            if (age < 18)
                throw new Exception();

            System.out.println("Eligible to vote.");
        } catch (Exception e) {
            System.out.println("Not eligible to vote.");
        }
    }
}