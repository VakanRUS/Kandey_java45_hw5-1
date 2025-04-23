import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
        int[] arr1 = new int[]{1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = {"весна", "лето", "осень", "зима" };
        System.out.println();

        //task 2
        System.out.println("task 2");
        for (int i = 0; i < arr1.length; i++) {
            if (i != arr1.length - 1) {
                System.out.print(arr1[i] + ", ");
            } else System.out.println(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (i != arr2.length - 1) {
                System.out.print(arr2[i] + ", ");
            } else System.out.println(arr2[i]);
        }
        for (int i = 0; i < arr3.length; i++) {
            if (i != arr3.length - 1) {
                System.out.print(arr3[i] + ", ");
            } else System.out.println(arr3[i]);
        }
        System.out.println();

        //task 3
        System.out.println("task 3");
        int max = arr1.length - 1;
        int min = 0;
        for (int count = max; count >= min; count--) {
            if (count != min) {
                System.out.print(arr1[count] + ", ");
            } else System.out.println(arr1[count]);
        }
        max = arr2.length - 1;
         for (int count = max; count >= min; count--) {
            if (count != min) {
                System.out.print(arr2[count] + ", ");
            } else System.out.println(arr2[count]);
        }
        max = arr3.length - 1;
        for (int count = max; count >= min; count--) {
            if (count != min) {
                System.out.print(arr3[count] + ", ");
            } else System.out.println(arr3[count]);
        }
        System.out.println();

        //task 4
        System.out.println("task 4");
        max = arr1.length - 1;
        for (int count = min; count <= max; count++) {
            if (arr1[count] % 2 != 0) {
                arr1[count] = arr1[count] + 1;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
    }
}