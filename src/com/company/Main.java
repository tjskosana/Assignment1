package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
  String startMessage;
        startMessage = "Welcome";
        System.out.println(startMessage);

        Scanner userinput = new Scanner(System.in);

        String name = "";
        int age;
        int sysAge;
        int ageDif;
        String difference = "";
        String OddEven = "";

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

        Random genAge = new Random();
        sysAge = genAge.nextInt(90-18)+18;
        System.out.println("sysAge is  " + sysAge);

        if(sysAge > age)
        {
            ageDif = sysAge - age;
        }else
            {
            ageDif = age - sysAge;
        }

        if(age > sysAge  )
        {
            difference = "Older";
        }else
        {
            difference = "Younger";
        }
        System.out.println("I am " + ">>" + sysAge + " " + "years old, which is  " + ageDif + " years " + difference + " than you." );

        if(sysAge % 2 == 0)
        {
            OddEven = "Even";
        }else
        {
            OddEven = "Odd";
        }
        System.out.println("Twice my age would be " + (sysAge * 2));
        System.out.println("My age is an " + OddEven + " number");
        System.exit(0);
    }
}
