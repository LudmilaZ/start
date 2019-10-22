import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static javafx.beans.binding.Bindings.concat;


public class star {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//люда
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

        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String a1 = a.replaceAll(" ", "");
        String b1= b.replaceAll(" ", "");
        System.out.println(a1.equalsIgnoreCase(b1));
//        if (a1.equalsIgnoreCase(b1))
//        {
//            System.out.println(true);
//        }
//        else{
//            System.out.println(false);
//        }


    }
}
