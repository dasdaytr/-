package laba18;

public class Laba1 {
    public static void recursion(int n, int k) {
        // k- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        // Шаг рекурсии / рекурсивное условие
        if (n % k == 0) {
            System.out.println(k);
            recursion(n / k, k);
        } // Шаг рекурсии / рекурсивное условие
        else {
            recursion(n, ++k);
        }
    }
    public static void recursion3(int max, int count) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n > max) {
                recursion3(n, 1);
            } // Шаг рекурсии / рекурсивное условие
            else if (n == max) {
                recursion3(max, ++count);
            } // Шаг рекурсии / рекурсивное условие
            else {
                recursion3(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static String recursion2(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                // Базовый случай
                if (s.length() == 2) {
                    return "YES";
                }
                // Шаг рекурсии / рекурсивное условие
                return recursion2(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static void main(String[] args) {
        recursion(150, 2); // первый номер
        recursion2("radar"); // второй номер
        recursion3(0,0);// третий номер
    }
}
