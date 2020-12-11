import java.util.Arrays;
import java.util.Scanner;

public class Loto3_10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Как много чисел нужно показать?");
        int k = in.nextInt();

        System.out.printf("Какое самое максимальное число?");
        int n = in.nextInt();

        //Заполняем массив
        int[] number = new int[n];
        for (int i = 0; i < number.length ; i++) {
            number[i]=i+1;
        }

        //Случайные номера
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            int r = (int)(Math.random()*n);
            result[i] = number[r];
            number[r]=number[n-1];
            n--;
        }

        Arrays.sort(result);
        for (int i:result) {
            System.out.println(i);
        }
    }
}
