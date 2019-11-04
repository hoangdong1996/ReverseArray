import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter size: ");
            size = input.nextInt();
            System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element: " + (i + 1) +": ");
            array[i] = input.nextInt();
            i++;
        }

        System.out.println("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int temp;
        for (int j = 0; j < array.length / 2; j++) {
            temp = array[j];
            array[j] = array[array.length - 1 - j];
            array[array.length - 1 - j] = temp;

        }

        System.out.print("Reverse Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }
}
