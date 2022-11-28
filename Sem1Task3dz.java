import java.util.Scanner;

public class Sem1Task3dz {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        System.out.print("Введите два числа: ");
        Scanner in = new Scanner(System.in);
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        System.out.print("\nВведите действие (+, -, *, /): ");
        op = in.next().charAt(0);
        in.close();
        switch(op) {
           case '+': ans = num1 + num2;
              break;
           case '-': ans = num1 - num2;
              break;
           case '*': ans = num1 * num2;
              break;
           case '/': ans = num1 / num2;
              break;
           default:  System.out.printf("Введите правильный оператор");
              return;
        }
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
     }
}
