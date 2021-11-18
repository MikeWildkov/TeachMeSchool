package Lesson3;

//Дан массив. Найти максимальный элемент массива.

public class Task5 {
    public static void main(String[] args) {
        int [] array = new int[5];
        int maxNumber = -6;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*11)-5;
            if(maxNumber <= array[i]){
                maxNumber = array[i];
                maxIndex = i;
            }

            System.out.println(array[i]);

        }

        System.out.println("Индекс максимального элемента: " + maxIndex);

    }

}