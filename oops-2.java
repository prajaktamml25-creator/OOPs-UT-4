import java.util.*;

class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30, 40, 50};

        try {
            int pos = sc.nextInt();
            System.out.println("Element = " + a[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array position.");
        }
    }
}