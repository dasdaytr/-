package laba14;

import java.util.Objects;

public class Student implements Comparable{
    private int ID;
     public Student(int ID){
        this.ID = ID;
     }


    @Override
    public int compare(Object o,int n) {


            Student student = (Student)o;
            return student.getID();


    }


    @Override
    public boolean equals(Object o) {
         Student student = (Student) o;

         return this.ID == student.getID();
    }

    public int getID() {
        return ID;
    }
}
