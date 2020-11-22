package laba21;

import java.util.Scanner;

public class laba21 {
    public static class Exception2 {
        void exceptionDemo_1(){
            try{
                System.out.println(2 / 0);
            } catch (Exception e){
                System.out.println(e.toString());
            }
            // Разделение на числа с плавающей запятой и числа с плавающей запятой
            // соответствует стандартам IEEE 754 для сопоставления с плавающей запятой,
            // что не должно вызывать исключения.
            System.out.println(2.0 / 0.0); // Infinity
        }
        void exceptionDemo_2() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer ");
            int i = Integer.parseInt(sc.next());
            try {
                System.out.println( 2 / i );
            } catch (Exception e){
                System.out.println("catch!" + e.toString());
            } finally {
                System.out.println("finally!");
                sc.close();
            }
        }
    }
    public static void main(String[] args){
        Exception2 object = new Exception2();
        object.exceptionDemo_1();
        object.exceptionDemo_2();
    }
}