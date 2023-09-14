// **Текст задачи:**
// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида

// text~num

// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
// </aside>*/
LinkedList<String> list = new LinkedList<>();
Scanner scanner = new Scanner(System.in);
boolean work = true;
while (work){
System.out.println("Ввелите команду : ");
String line = scanner.nextLine();
String[] arr = line.split("~");
int num = Integer.parseInt(arr[1]);
String text = arr[0];
switch (text){
case "print" :
System.out.println(list.remove(num));
break;
case "exit" :
System.out.println("Пока! ");
work = false;
break;
default:
list.add(num, text);
}
}
}