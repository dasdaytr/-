package lab10;

public class Main {
    public static int num1(int len, int sum, int k, int s) {
        // Базовый случай
        if (len == k) {
            if (sum == s) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (len == 0 ? 1 : 0);
        int res = 0;
        // Шаг рекурсии / рекурсивное условие
        for (int i = c; i < 10; i++) {
            res += num1(len + 1, sum + i, k, s);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(num1(0, 0, 3, 15)); // вызов рекурсивной функции
        System.out.println(num2(5, 8));
        System.out.println(num3(153));
    }
    public static int num2(int a, int b) {
        // Базовый случай
        if (a > b + 1) {
            return 0;
        }
        // Базовый случай
        if (a == 0 || b == 0) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return num2(a, b - 1) + num2(a - 1, b - 1);
    }
    public static String num3(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return num3(n / 10) + " " + n % 10;
        }
    }
}
