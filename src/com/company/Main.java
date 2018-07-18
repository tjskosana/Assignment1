package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
  String startMessage;
        startMessage = "Welcome";
        System.out.println(startMessage);

        Scanner userinput = new Scanner(System.in);

        String name = "";
        int age = 0;
        System.out.println("Please enter your name");
        name = userinput.nextLine();


        GregorianCalendar time = new GregorianCalendar();
        int hour = time.get(Calendar.HOUR_OF_DAY);
if(hour<12) {
    System.out.println("Good morning " + "" + name);
}
else
{
    System.out.println("Good Afternoon " + "" + name);
}

        System.out.println("Please enter your age");
        age = userinput.nextInt();
    }
}
