package Lesson3;

//Имеется двумерный массив. Найти минимальный элемент массива.

public class Task7 {
    public static void main(String[] args) {
        int[][] array = {{3, 1, 4, 3}, {6, 7, 4, 5}};

        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]){
                    min = array[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент массива: " + min);
    }
}