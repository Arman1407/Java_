// Текст задачи:

// 1) Написать метод, который принимает массив элементов,
// помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов,
// помещает их в очередь и выводит на консоль содержимое очереди.


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task#4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 9, 12, 14, 16, 22, 23};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            queue.add(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            System.out.print("\t");
            System.out.println(queue.poll());
        }
    }
}