package hw#4;

/**
 * task4
 * 4. *+Задано уравнение вида q + w = e, q, w, e >= 0. 
 * Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69. 
 * Требуется восстановить выражение до верного равенства. 
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */
/**
 * task#4
 */
public class task#4 {

    public static void main(String[] args) {
       // boolean result = true;
       // while (result) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    for (int k = 0; k < 9; k++) {
                        for (int l = 0; l < 9; l++) {
                            for (int m = 0; m < 9; m++) {
                                for (int n = 0; n < 9; n++) {
                                    if ((i * 10 + j) + (k * 10 + l) == (m * 10 + n)) {
                                        int q = i * 10 + j;
                                        int w = k * 10 + l;
                                        int e = m * 10 + n;
                                        System.out.printf("%d + %d = %d   ", q, w, e);
                                        
                                        //result=false;
                                    }
                                }
                            }
                        }
                    }
                }
            }

        //}
    }
}