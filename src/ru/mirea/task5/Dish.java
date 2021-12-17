package ru.mirea.task5;

        import java.lang.*;

public abstract class Dish {
    private String color;
    private String size;
    public Dish(){};

    public Dish(String color, String size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() { return color; }
    public String getSize() { return size; }
    public abstract void displayInfo();
}



class Cutlery extends Dish {
    private String type;

    public Cutlery(String color, String size, String wati) {
        super(color, size);
        this.type = wati;
    }

    public void displayInfo() {
        System.out.println("Столовый прибор: " + type + " | Цвет: "
                + super.getColor() + " | Размер: " + super.getSize());
    }
}



class Cup extends Dish {
    private String type;

    public Cup (String color, String size, String high) {
        super(color, size);
        this.type = high;
    }

    public void displayInfo() {
        System.out.println("Высота чашки: " + type + " | Цвет: "
                + super.getColor() + " | Размер: " + super.getSize());
    }
}