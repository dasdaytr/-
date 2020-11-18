package laba17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Запись в файл
        try(FileWriter writer = new FileWriter("C:\\Users\\dan\\Desktop\\lab4\\laba17\\abc.txt", false))
        {
            System.out.println("запись в файл введённой с клавиатуры информации");
            Scanner scanner = new Scanner(System.in);
            // запись всей строки
            String text = scanner.nextLine();
            writer.write(text);



            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //чтение из другого файла
        try(FileReader reader = new FileReader("C:\\Users\\dan\\Desktop\\lab4\\laba17\\hello.txt"))
        {
            // читаем посимвольно
            System.out.println("вывод информации из ДРУГОГО файла на экран");
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0){

                if(c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println();
        //Замена инфорамации в файле hello
        try(FileWriter writer = new FileWriter("C:\\Users\\dan\\Desktop\\lab4\\laba17\\hello.txt", false))
        {
            System.out.println("Заменить информацию в файле на информацию, введённую с клавиатуры");
            Scanner scanner = new Scanner(System.in);
            // запись всей строки
            String text = scanner.nextLine();
            writer.write(text);



            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //Добавить в конец файла hello новые слова
        try(FileWriter writer = new FileWriter("C:\\Users\\dan\\Desktop\\lab4\\laba17\\hello.txt", true))
        {
            System.out.println("Добавить в конец исходного файла текст(Введите с клавиатуру, что хотите добавить");
            Scanner scanner = new Scanner(System.in);
            // запись всей строки
            String text = scanner.nextLine();
            writer.write(text);
            writer.append("  ");


            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
