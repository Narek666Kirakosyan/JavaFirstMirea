
package ru.mirea.task5;

        import java.lang.*;
public class TestDish {
    public static void main(String[] args) {
        Dish a1 = new Cup("белая", "большая", "низкая");
        Dish a2 = new Cutlery("серебряная", "маленькая", "вилка");
        a1.displayInfo();
        a2.displayInfo();
    }
}