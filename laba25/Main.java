package laba25Tack1;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void task2() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в форате день.месяц.год часы:минуты");
        String apData = scanner.nextLine();
        Date date = simpleDateFormat.parse(apData);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.print(calendar.getTime());
    }
    public static void task1() throws ParseException {
        Student student = new Student();
        student.setData("22.02.2001");
        student.toString(student.getData());

    }
    public static void task3(){
        Calendar calendar = new GregorianCalendar(2020, Calendar.NOVEMBER, 14, 15, 0);
        Date dateTake = calendar.getTime();
        Date dateDone = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("Швитки \nДата получения: " + df.format(dateTake) + "\nДата сдачи: " + df.format(dateDone));
    }
    public static void main(String[] args) throws ParseException {
        task1();
    }
}
