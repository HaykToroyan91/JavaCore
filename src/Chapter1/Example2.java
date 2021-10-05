package Chapter1;

import java.sql.SQLOutput;

public class Example2 {
    public static void main(String[] args) {
        int num;
        num = 100;
        System.out.println("This is num:" + num);
        num = num * 2;
        System.out.println("The value of num*2 is");
        System.out.println(num);
        if (num < 100) {
            System.out.println(" num poqr kam havasar e haryuri");
        } else {
            System.out.print("hubb");
             }
        for (int i = 1; i <= 7; i++) {
            System.out.print("kuku" + i);
        }

    }
}
