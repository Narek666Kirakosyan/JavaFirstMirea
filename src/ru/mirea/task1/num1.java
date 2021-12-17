package ru.mirea.task1;
import java.util.Scanner;
public class num1 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int[] q = new int[10];
        int sum = 0;
        for (int i = 0; i < q.length; i++) {
            q[i] = p.nextInt();
            sum = sum + q[i];
        }
        System.out.println("Сумма элементов целочисленного массива: "+sum);
    }
}