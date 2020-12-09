package laba25Tack1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Student {
        private String data;
        public Student(String data){
            this.data = data;
        }
        public Student(){};

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }



    public void toString(String a) throws ParseException {
        String al;
        Random random = new Random();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date date1 = simpleDateFormat.parse(a);
        DateFormat dateFormat;
        int b = random.nextInt(4);
        if(b ==0){
            dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
            al = dateFormat.format(date1);
            System.out.println(dateFormat.format(date1));
        }
        if(b ==1){
            dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
            al = dateFormat.format(date1);
            System.out.println(dateFormat.format(date1));
        }
        if(b ==2){
            dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
            al = dateFormat.format(date1);
            System.out.println(dateFormat.format(date1));
        }
        if(b ==3){
            dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
            al = dateFormat.format(date1);
            System.out.println(dateFormat.format(date1));
        }

    }
}
