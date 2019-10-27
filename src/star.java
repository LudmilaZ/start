import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static javafx.beans.binding.Bindings.concat;


public class star {

    public static void main(String[] args) {


//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//
//        double[] arra = new double[5];
//
//        int n = 5;
//        for (int i = 1; i < arra.length+1; i++) {
//            arra[i - 1] = Math.pow(a, i);
//        }
//        System.out.println(Arrays.toString(arra));
//
//        Arrays.sort(arra);
//
//        System.out.println("min "+arra[0]);
//        System.out.println("max "+arra[arra.length-1]);


//        String b = scanner.nextLine();
//        if (b.endsWith("burg"))
//        {
//            System.out.println(true);
//        }
//        else
//        {
//            System.out.println(false);
//        }


//        String b = scanner.nextLine();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        char mystring = b.charAt(c);
//
//        System.out.println(String.valueOf(mystring).concat(String.valueOf(b.charAt(d))));

//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
//        String a1 = a.replaceAll(" ", "");
//        String b1= b.replaceAll(" ", "");
//        System.out.println(a1.equalsIgnoreCase(b1));
//        if (a1.equalsIgnoreCase(b1))
//        {
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }

//
//    }     char[] chars = a.toCharArray();
//        String resultString = "";
//        for (int i = chars.length - 1; i >= 0; i--) {
//            System.out.print(chars[i]);
//
// единичная матрица
//        int[][] arr = new int [4][4];
//
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//
//                if (i == j) {
//                    arr[i][j] = 1;
//                } else {
//                    arr[i][j] = 0;
//                }
//            }
//        }
//        System.out.print(Arrays.deepToString(arr));

// есть матрица вводим два номера строк они должны быть заменяны местами

        int[][] arr = new int [5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int) (Math.random() * 51);
            }
        }
        System.out.print(Arrays.deepToString(arr));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int change_a;
        for (int i = 0; i < 5; i++) {
            
            change_a = arr[a][i];
            arr[a][i] = arr[b][i];
            arr[b][i] = change_a;
        }

        System.out.print(Arrays.deepToString(arr));
    }
}
