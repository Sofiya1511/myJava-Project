package lesson.school1;

public class HomeWorkApp {
    public static void main(String[]args) {
        printThreeWords();
        checkHomeWork();
        howIsTheWeatherThere();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.pintln("Apple");
    }
    public static void checkHomeWork() {
        int tasksCount = 3;

        if (tasksCount == 3) {
            System.out.printLn("Неплохо,Вы выполнили половину заданий но есть над чем поработать!");

        }
        if (taskCounnt > 3) {
            System.out.printl("Beликолепно!Продолжайте в том же духе");

        }
        if (tasksCount < 3) {
            System.out.println("Вы не справились с заданием, проработайте теоретическую часть");

        }
        System.out.println("Проверка завершена");

    }
    public static void howIsTheWeatherThere() {
        int temprature = 12;
        if (temprature >= 20) {
            System.out.println("Это слишком тепло для середины сентября!");
        } else if (temprature < 20 &&temprature > 10) {
            System.out.println("Чувствуется приход осени!");
        } else {
            System.out.println("Кажется, пора доставать шерстяной свитер");
        }

    }
}
