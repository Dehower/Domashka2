import java.util.Scanner;

public class domashhka2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Введите числа для массива:");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Введите число для поиска: ");
        int key = scanner.nextInt();

        System.out.printf("Индекс =%d%n", binarySearch(arr, key));
    }

    public static int binarySearch(int[] array, int key ) {
        int index = -1;
        int low = 0;
        int high = array.length -1;


        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
