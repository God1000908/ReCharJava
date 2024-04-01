import java.util.Scanner;
public class math {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public double div(int a, int b) {
        return (double)a / (double)b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input the first num: ");
        int first_num = sc.nextInt();
        System.out.print("Pleare input the second num: ");
        int second_num = sc.nextInt();
        math operator = new math();
        System.out.println("Add: " + operator.add(first_num, second_num));
        System.out.println("Sub: " + operator.sub(first_num, second_num));
        System.out.println("Mul: " + operator.mul(first_num, second_num));
        System.out.println("Div: " + operator.div(first_num, second_num));
    }
}