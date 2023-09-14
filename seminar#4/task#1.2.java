// <aside>
// 📔 **Текст задачи:**
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

// </aside>

public static void arrList() {
        Long start = System.currentTimeMillis();
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt(100));
        }
        Long finish = System.currentTimeMillis() - start;
        System.out.println(finish);
    }

    public static void linList() {
        Long start = System.currentTimeMillis();
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt(100));
        }
        Long finish = System.currentTimeMillis() - start;
        System.out.println(finish);
}