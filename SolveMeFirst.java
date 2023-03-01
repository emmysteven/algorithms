import java.util.Scanner;

public class SolveMeFirst {
    static int solveMeFirst(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int a;
        int b;
        int sum;

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();

        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}
