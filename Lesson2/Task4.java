package Lesson2;

//Сумма всех углов треугольника равна 180 градусов. Даны 3
//угла, вывести на экран true, если треугольник с такими
//углами существет и false - в противном случае.

public class Task4 {
    public static void main(String[] args) {
        int a = 180;    //сумма углов треугольника

        int x = 59;
        int y = 61;
        int z = 60;

        if (x + y + z == a)
            System.out.println("True");
        else if (x + y + z < a)
            System.out.println("False");
        else if (x + y + z > a)
            System.out.println("False");

    }
}
