import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static javafx.beans.binding.Bindings.concat;


public class star {

    public static void main(String[] args) {
//Дан массив с целыми числами и число вывечти все числа енаиболее близкие к заданному l
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int mejorNumero = Integer.MAX_VALUE;
        int nearest = -1;
        boolean print= true;
        List<Integer> list = Arrays.asList(1, 2, 123,456,6,4);
        for (int i  : list) {
            if (list.get(i) == a) {
                System.out.println(list.get(i));
                print=false;
                break;
            }

            int d = Math.abs(a - list.get(i));
            if (d == mejorNumero) {
                System.out.println(nearest);
            }
            if (d <= mejorNumero) {
                mejorNumero=d;
                nearest = list.get(i);
            }

        }
        if (print ){
        System.out.println(nearest);}

      //Занятие 14 два массива вывести все больше нуля значения
//        List<Integer> list = Arrays.asList(1, -2, 3);
//        List<Integer> list1 = Arrays.asList(2, 0, 3);
//        List<Integer> list13 = new ArrayList<Integer>();
//
//        for (Integer i : list) {
//            if (i > 0) {
//                list13.add(i);
//            }
//        }
//        for (Integer i : list1) {
//            if (i > 0) {
//                list13.add(i);
//            }
//        }
//        System.out.println(list13);
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

//        int[][] arr = new int [5][5];
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr[i][j] = (int) (Math.random() * 51);
//            }
//        }
//        System.out.print(Arrays.deepToString(arr));
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int change_a;
//        for (int i = 0; i < 5; i++) {
//
//            change_a = arr[a][i];
//            arr[a][i] = arr[b][i];
//            arr[b][i] = change_a;
//        }
//
//        System.out.print(Arrays.deepToString(arr));


        ///Задача про чат бот
//        String[][] arr = new String[5][3] ;
//        arr[0][0] = "Где ты живешь?";
//        arr[0][1] = "Я там не была";
//        arr[0][2] = "Я там не была";
//        arr[1][0] = "Сколько тебе лет?";
//        arr[1][1] = "0";
//        arr[1][2] = "ММММ понятно!";
//        arr[2][0] = "У тебя есть кошка?";
//        arr[2][1] = "Класс я тоже хочу";
//        arr[2][2] = "ММММ понятно!";
//        arr[3][0] = "Ездил куда нибудь?";
//        arr[3][1] = "Класс я тоже хочу";
//        arr[3][2] = "ММММ понятно!";
//        arr[4][0] = "Был в Мавзолее";
//        arr[4][1] = "Крутяк да! Дядька там классный";
//        arr[4][2] = "Жалко сходи";
//
//        System.out.println("Привет! Меня зовут ЧатБот! Хочешь поговорить со мной?");
//        Scanner scanner = new Scanner(System.in);
//        String b = scanner.nextLine();
//        if (recibirRespuestasSiNo(b.toLowerCase())) {
//            System.out.println("Как тебя зовут?");
//            b = scanner.nextLine();
//            System.out.println("Привет " + b);
//            System.out.println("Если я тебе надоела напиши Пока и я уйду");
//            int i = 1;
//            for (i = i; ; ) {
//
//
//                int pregunta = (int) (Math.random() * arr.length);
//                System.out.println(arr[pregunta][0]);
//                b = scanner.nextLine();
//                if (arr[pregunta][1].equals("0")) {
//                    // Проверяем что это число не ноль и большой или маленький
//                    System.out.println(elegirRespuesta(b));
//                } else if (recibirRespuestasSiNo(b.toLowerCase())) {
//
//                    System.out.println(arr[pregunta][1]);
//                }
//                else if (b.equalsIgnoreCase( "пока")){
//                    System.out.println("Пока");
//                    break;
//                }
//                else {
//                    System.out.println(arr[pregunta][2]);
//                }
//            }
//
//        } else {
//            System.out.println("Ну ок пока!");
//        }
//
//
//    }
//
//    private static boolean recibirRespuestasSiNo(String respuesta) {
//        if (respuesta.equalsIgnoreCase("да") || respuesta.equalsIgnoreCase("не знаю") || respuesta.equalsIgnoreCase("может быть") || respuesta.equalsIgnoreCase("давай") || respuesta.equalsIgnoreCase("говори")) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//    private static String elegirRespuesta(String respuesta) {
//        if (Integer.parseInt(respuesta) == 0) {
//            return "Не обманывай меня";
//        } else if (Integer.parseInt(respuesta) > 20) {
//            return "Большой!";
//        } else {
//            return "Привет малыш!";
//        }
//    }
//

    }

}
