import db.DB;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.setLight(true);
        bmw.blinkLight();

    }
}
//
//    final int count = 10;
//
//
//    Person obg1=new Person();
//    Person obg2=new Person();
//    Person obg3=new Person();
//    Person obg4=new Person();
//        Person.getCount();
//
//
//
//
//
//    DB db = new DB();
//
//
//    info("Hello World");


//
//}
//
//public static void info() {
//    System.out.println("Hello");
//}
//
//public static void info(String word) {
//    System.out.println(word + "!");
//}

//        Person.count = 5;
//        System.out.println(Person.count);


//Car bmw = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0});
//        bmw.engine.setValues(false, 2000);
//
//Truck truck = new Truck(5600, new byte[]{100, 0, 100}, false);
//        truck.engine.setValues(true, 2000);
//        truck.setLoaded(true);
//        truck.getLoaded();


//        truck.speed = 140.5f;
//        truck.weight = 5600;
//        truck.color = "Red";
//        truck.coordinate = new byte[]{100, 0, 100};
//
//        String res2 = truck.getValues();
//        System.out.println(res2);


//byte[] nums1 = new byte[]{5, 6, 8};
//int summ1 = summaArray(nums1);
//        System.out.println("Сумма 1: " + summ1);
//
//byte[] nums2 = new byte[]{5, 7, 3, 7, 6, 8};
//int summ2 = summaArray(nums2);
//        System.out.println("Сумма 2: " + summ2);
//
//    }
//
//public static int summaArray(byte[] arr) {
//    int summa = 0;
//    for (byte i = 0; i < arr.length; i++)
//        summa += arr[i];
//    return summa;
//


//Функции
//        info("Hello");
//        String java = "Java";
//        info(java);
//      info("");
//
//
//short num = 7;
//int result1 = summa((short) 5, num);
//
//short num2 = 8;
//int result2 = summa((short) 4, num2);
//info(String.valueOf(result2));
//        }
//
//public static int summa(short a, short b) {
//    int res = a + b;
//    String result = "Результат: " + res;
//    info(result);
//    return res;
//}
//
//public static void info(String word) {
//    System.out.print(word);
//    System.out.println("!");

//Коллекции в Java
//LinkedList<Float> numbers = new LinkedList<>();
//        numbers.add(5.6f);
//        numbers.add(15.26f);
//        numbers.add(5.64356f);
//
//        for(Float el : numbers)
//        System.out.println(el);

//
//ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(50);
//        numbers.add(1,30);
//
//        System.out.println(numbers.size());
//        System.out.println(numbers.get(1));
//        numbers.remove(1);
//        numbers.clear();
//
//        for (Integer el : numbers){
//        System.out.println(el);
//        }
//
//
//char[][] syms = new char[2][2];
//syms[0][0] = 't';
//        System.out.println(syms[0][0]);
//
//byte[][] nums = new byte[][]{
//        {5, 7},
//        {7, 3},
//        {2, 0}
//};
//
//nums[1][1] = 67;
//        System.out.println(nums[1][1]);
//
//        for()
//                for ()
//        int[] arr = new int[4];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print("Введите число: ");
//            int value = scanner.nextInt();
//            arr[i] = value;
//        }
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] < min)
//                min = arr[i];
//
//        }
//        System.out.print("Minimal: " + min);
//
//
//Массив данных
//        int[] nums = new int[5];
//        nums[0] = 45;
//        nums[1] = 32;
//        nums[2] = 1;
//        nums[3] = 9;
//        nums[4] = 3;
//        int res =nums[2] + nums[3];
//        System.out.println(res);
//
//
//        float[] nums2 = new float[] {5.0f,6.45f,89.984f};
//
//
//        for(int i = 0 ; i < nums2.length; i++){
//            System.out.println("Element:" +nums2[i]);
//        }
//
//

//Циклы
//        for (float i = 100; i > 10; i/= 2){
//            System.out.println("Element: " +i);
//
//        }
//
//        int i = 0;
//        while (i < 10){
//            System.out.println("Element: " +i);
//            i++;
//        }
//
//        int i = 0;
//        do {
//            System.out.println("Element: " + i);
//            i *= 100;
//
//        } while (i < 10);
//
//        for (int i = 5; i < 25; i += 2) {
//            if (i % 3 == 0)
//                continue;
//
//            if (i >= 17)
//                break;
//            System.out.println("Element: " + i);
//        }

//Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите 1 число: ");
//int num1 = scanner.nextInt();
//
//        System.out.print("Введите 2 число: ");
//int num2 = scanner.nextInt();
//
//int res;
//
//        System.out.print("Действие: ");
//String action = scanner.nextLine();
//action = scanner.nextLine();
//
//        switch (action) {
//        case "+":
//res = num1 + num2;
//                System.out.println("Результат: " + res);
//                break;
//                        case "-":
//res = num1 - num2;
//                System.out.println("Результат: " + res);
//                break;
//                        case "*":
//res = num1 * num2;
//                System.out.println("Результат: " + res);
//                break;
//                        case "/":
//                        if (num2 == 0)
//        System.out.println("Error");
//                else {
//res = num1 / num2;
//                    System.out.println("Результат: " + res);
//                    break;
//                            }
//default:
//        System.out.println("Вы что-то не то ввели.");
//
//        }