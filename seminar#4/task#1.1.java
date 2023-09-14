static void task0(){
/*<aside>
📔 **Текст задачи:**
1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.

2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

</aside>*/
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    long start = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
        list1.add(0,i);
    }
    long middle = System.currentTimeMillis();
    for (int i = 0; i < 1000000; i++) {
        list2.add(0,i);
    }
    long finish = System.currentTimeMillis();
    System.out.println(middle - start);
    System.out.println(finish - middle);
}

static void task1(){
/*<aside>