package Kata_1;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {
    
    
    public static void main(String[] args){
        System.out.println("hola mundo");
        LocalDate birthdate;
        birthdate = LocalDate.of(1980, 1, 1);
        Person person = new Person ("Antonio", birthdate);
        System.out.println(person.getName()+" tiene " +person.getAge()+".");
    }
}
