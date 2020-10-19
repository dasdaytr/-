package laba13;

import java.util.Scanner;

public class test {
    public static void main(String []args){
            System.out.println("Введите количество  студентов");
            Scanner scanner = new Scanner(System.in);
            Student sor = new Student();
            int k = scanner.nextInt();
            int[] idNumber = new int[k];
            Student []students = new Student[k];
            for(int i = 0;i <students.length;i++){

                int random = 0+ (int)(Math.random()*k*30);
                students[i] = new Student();
                students[i].setIdStudent(random);
            }
            for (int i = 0;i <k;i++){
                System.out.print(students[i].getIdStudent()+" ");
                idNumber[i] = students[i].getIdStudent();
            }
            System.out.println();
            idNumber = sor.sort(idNumber,k);
            System.out.println("Отсорттрованные ID студентов");
            for (int i = 0; i<k;i++){
                System.out.print(idNumber[i]+ " ");
            }
    }
}
