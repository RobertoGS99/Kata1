package Kata_1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args){
        System.out.println("hola mundo");
        Person person = new Person ("Antonio", new Date(80,1,1));
        System.out.println(person.getName()+" tiene " +person.getAge()+".");
    }
}
