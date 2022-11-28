import java.util.Scanner;

//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class Sem1Task1dz {
    public static void main(String[] args) {
        System.out.print("Введите целое положительное число n: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int countSum = 0;
        int countMult = 1;
        for (int i = 1; i < n + 1; i++) {
            countSum += i;
            countMult *= i;
        }
        System.out.println("n-ое треугольное число равно: " + countSum);
        System.out.println("факториал n равен: " + countMult);
    }
    
}
