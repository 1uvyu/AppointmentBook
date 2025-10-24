import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.io.File;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        System.out.println(a);
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        for(int i = 50; i < 60; i++) schedule[1][i] = true;
        a.printPeriod(2);
        System.out.println(a.findFreeBlock(2,15));
        System.out.println(a.findFreeBlock(2,9));
        System.out.println(a.findFreeBlock(2,20));
        schedule = new boolean[8][60];
        for(int i = 25; i < 30; i++) schedule[1][i] = true;
        for(int i = 0; i < 15; i++) schedule[2][i] = true;
        for(int i = 41; i < 60; i++) schedule[2][i] = true;
        for(int i = 5; i < 30; i++) schedule[3][i] = true;
        for(int i = 44; i < 60; i++) schedule[3][i] = true;

        AppointmentBook b = new AppointmentBook(schedule);
        int period = 2;
        while(period < 5)
        {
            System.out.println("Period: " + period);
            b.printPeriod(period);
            period++;
        }

        System.out.println("Period 4:");
        b.printPeriod(4);
        System.out.println(b.makeAppointment(2, 4, 22));
        b.printPeriod(4);
        System.out.println();
        System.out.println("Period 3:");
        b.printPeriod(3);
        System.out.println(b.makeAppointment(3, 4, 3));
        b.printPeriod(3);
        System.out.println();
        System.out.println("Period 2:");
        b.printPeriod(2);
        System.out.println(b.makeAppointment(2, 4, 30));
        b.printPeriod(2);
    }

    public static int read() throws FileNotFoundException
    {
        int fulfilled = 0;

    }

}
