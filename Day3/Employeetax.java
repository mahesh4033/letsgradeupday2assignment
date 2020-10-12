package com.company;
import java.util.Scanner;
public class Employeetax {


    public static void main(String[] args)
    {
        String nameOfEmployee,dateofbirth;
        double salary;
        System.out.println("Enter name of the employee:");
        Scanner scan = new Scanner(System.in);
        nameOfEmployee=scan.next();
        System.out.println("Enter Date of birth:");
        Scanner scan1=new Scanner(System.in);
        dateofbirth = scan1.next();
        System.out.println("enter you salary:");
        Scanner scan2=new Scanner(System.in);
        salary=scan2.nextDouble();
        double packagee=salary*12;
        System.out.println(packagee);
        System.out.println("Name:"+" "+nameOfEmployee);
        System.out.println("Date of Birth:"+ " "+dateofbirth);
        System.out.println("salary"+" "+salary);
        System.out.println("package"+ " "+packagee);
        if (packagee>=500000)
         //   scan.display();
            System.out.println("Tax is "+" "+(packagee/100)*20);
        else if ((packagee>=400000)&&(packagee<500000))
            System.out.println("Tax is "+" "+(packagee/100)*15);
        else if((packagee>=300000)&&(packagee<400000))
            System.out.println("tax is "+" "+(packagee/100)*10);
        else if ((packagee>=200000)&&(packagee<300000))
            System.out.println("tax is "+" "+(packagee/100)*5);
        else {

            System.out.println("No Tax!");
        }

    }

}

 
