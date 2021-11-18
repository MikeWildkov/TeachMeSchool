package Lesson3;

//Введите число от 0 до 9. Программа выводит это число и слово (день, дня, дней) в
//зависимости от того, что подходит. Пример, 0 дней, 1 день, 2 дня, 6 дней ... Сделать
//через switch. Если число будет меньше 0, вывести ошибку, если число будет больше 0
//вывести сообщение, о том, что данная функциональность пока не доступна.

public class Task2 {
    public static void main(String[] args) {

        int num = 7;
        switch (num) {
            case 0:
                System.out.println("0 дней");
                break;
            case 1:
                System.out.println("1 день");
                break;
            case 2:
                System.out.println("2 дня");
                break;
            case 3:
                System.out.println("3 дня");
                break;
            case 4:
                System.out.println("4 дня");
                break;
            case 5:
                System.out.println("5 дней");
                break;
            case 6:
                System.out.println("6 дней");
                break;
            case 7:
                System.out.println("7 дней");
                break;
            case 8:
                System.out.println("8 дней");
                break;
            case 9:
                System.out.println("9 дней");
                break;
        }
        if(num < 0){
            System.out.println("ERROR");}
            else if(num > 0){
                System.out.println("Данная функциональность пока не доступна");
        }
    }
}
