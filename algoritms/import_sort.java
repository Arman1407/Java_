import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = new Random().nextInt(10);

        print(array);
        quickSort(array);
        print(array);

        System.out.println(binSearch(array, 5));

        Vector a = new Vector(2, 5, 1);
        Vector b = new Vector(2, 5, 1);

        System.out.println(a.length() + "    " + b.length());

        if (a.compareTo(b) > 0) // a > b
            System.out.println("A is bigger than B");
        if (a.compareTo(b) < 0) // a < b
            System.out.println("A is smaller than B");
        if (a.compareTo(b) == 0) // a == b
            System.out.println("A equals B");



    }

    public static int binSearch(int[] array, int value) {
        return binSearch(array, value, 0, array.length - 1);
    }

    public static int binSearch(int[] array, int value, int left, int right) {
        if (right < left)
            return -1;
        int mid = (left + right) / 2;
        if (array[mid] > value)
            return binSearch(array, value, left, mid - 1);
        else if (array[mid] < value)
            return binSearch(array, value, mid + 1, right);
        else
            return mid;
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2];
        while (leftMarker <= rightMarker) {
            while (array[leftMarker] < pivot)
                leftMarker++;
            while (array[rightMarker] > pivot)
                rightMarker--;
            if (leftMarker <= rightMarker) {
                if (leftMarker != rightMarker) {
                    int temp = array[leftMarker];
                    array[leftMarker] = array[rightMarker];
                    array[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftMarker < rightBorder)
            quickSort(array, leftMarker, rightBorder);
        if (leftBorder < rightMarker)
            quickSort(array, leftBorder, rightMarker);

    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min])
                    min = j;
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void selectionSort2(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int value = array[j];
            int i = j - 1;
            for (; i >= 0; i--) {
                if (value < array[i])
                    array[i + 1] = array[i];
                else
                    break;
            }
            array[i + 1] = value;
        }
    }

    public static void print(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }

}

class Vector implements Comparable<Vector> {
    int x;
    int y;
    int z;

    Vector() {
    }

    public int compareTo(Vector vector) {
        double thisLength = this.length();
        double vectorLength = vector.length();
        if (thisLength > vectorLength)
            return 1;
        else if (thisLength < vectorLength)
            return -1;
        else
            return 0;
    }

    Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
}