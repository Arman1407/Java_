import java.util.LinkedList;
import java.util.Scanner;

//Текст задачи:
// Реализовать консольное приложение, которое:
//
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая
// - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.

public class task#3 {
    public static void main(String[] args) {
    Task_3();
    }
    static void task#3() {
        LinkedList<String> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("Ввелите команду : ");
            String line = scanner.nextLine();

            switch (line) {
                case "print":
                    for (int i = list.size()-1; i >= 0 ; i--) {
                        System.out.println(list.get(i));
                }
                break;
            case "revert" :
                list.removeLast();
                break;
            case "exit":
                System.out.println("Пока! ");
                work = false;
                break;
            default:
                list.add(line);
            }
        }
    }
}