package Lesson2;

//Дано натуральное число Т, которое представляет
//длительность прошедшего вермени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах
//в следующей форме: HHч Мммин SSс.

public class Task11 {
    public static void main(String[] args) {
        int T = 260;

        int hour = T / 3600;
        int minute = (T %= 3600) / 60;
        int second = (T - (minute * 60)); //не уверен, но похоже на правду

        System.out.println(hour + "ч " + minute + "мин " + second + "с");
    }
}
