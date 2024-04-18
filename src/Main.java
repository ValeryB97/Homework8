import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        int[] numb = new int[3];
        numb[0] = 1;
        numb[1] = 2;
        numb[2] = 3;
        float[] numbs = {1.57f, 7.654f, 9.986f};
        int[] arr = {24, 52, 13, 9};
        // Задание 2
        for (int i = 0; i < numb.length; i++) {
            if (i != 2) {
                System.out.print(numb[i] + ", ");
            } else {
                System.out.println(numb[i]);
            }
        }
        for (int i = 0; i < numbs.length; i++) {
            if (i != 2) {
                System.out.print(numbs[i] + ", ");
            } else {
                System.out.println(numbs[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != 3) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        // Задание 3
        for (int i = numb.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numb[i] + ", ");
            } else {
                System.out.println(numb[i]);
            }
        }
        for (int i = numbs.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbs[i] + ", ");
            } else {
                System.out.println(numbs[i]);
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        // Задание 4
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] % 2 != 0) {
                numb[i]++;
            }
        }
        System.out.println(Arrays.toString(numb));
    }
}