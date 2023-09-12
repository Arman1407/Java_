package seminar#3;

import java.util.ArrayList;
import java.util.Random;

public class assorti {

    // Создание рандомной коллекции
    public static void RandomCollection(ArrayList<Integer> list) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++)
            list.add(rnd.nextInt(10));
        System.out.println(list);
    }

    // среднеарифметическое коллекции
    public static void midArithmetic(ArrayList<Integer> list) {
        double w = 0;
        for (Integer i : list)
            w += i;
        System.out.println("ср. арифм.= " + w / list.size());
    }

    // Минимальное и максимальное чиса коллекции
    public static void MinMax(ArrayList<Integer> list) {
        int max = 0;
        int min = 999999;
        for (Integer j : list) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        System.out.println("max= " + max);
        System.out.println("min= " + min);
    }

    // Удаление из коллекции чётных чисел
    public static void delEvenNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.print(list);
    }

    // разница коллекций
    public static void difference(ArrayList<Integer> list, ArrayList<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list2.get(i) == list.get(j)) {
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }

    // Разница элементов коллекций
    public static void differenceElement(ArrayList<Integer> list, ArrayList<Integer> list2) {
        ArrayList<Integer> differenceElement = new ArrayList<>();
        for (int i = 0, j = 0; i < list.size() || i < list2.size(); i++, j++) {
            differenceElement.add(list.get(i) - list2.get(j));
        }
        System.out.println(differenceElement);
    }

    // симметричная разница коллекций
    public static void differenceSymmetry(ArrayList<Integer> list, ArrayList<Integer> list2) {
        ArrayList<Integer> massivDuble = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list2.get(i) == list.get(j)) {
                    massivDuble.add(list.get(j));
                }
            }
        }
        list.addAll(list2);

        for (int i = 0; i < massivDuble.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == massivDuble.get(i))
                    list.remove(list.get(j));
            }
        }
        System.out.println(list);
    }
}