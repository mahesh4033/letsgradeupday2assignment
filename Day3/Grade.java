package com.company;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;
class Grade{
    public static void main(String[] args){
        int sub1,sub2,sub3,sub4,sub5,total_marks;

        System.out.println("Enter a mark of subject 1:");//1st subject mark
        Scanner scan=new Scanner(System.in);
        sub1=scan.nextInt();
        System.out.println("Enter a mark of subject 2:");
        Scanner scan2=new Scanner(System.in);
        sub2=scan2.nextInt();
        System.out.println("Enter a mark of subject 3:");
        Scanner scan3=new Scanner(System.in);
        sub3=scan3.nextInt();
        System.out.println("Enter a mark of subject 4:");
        Scanner scan4=new Scanner(System.in);
        sub4=scan4.nextInt();
        System.out.println("Enter a mark of subject 5:");
        Scanner scan5=new Scanner(System.in);
        sub5=scan5.nextInt();
        total_marks=sub1+sub2+sub3+sub4+sub5;
        System.out.println("total marks:"+ "  "+total_marks+"  "+"out of 500");
         float percentage;
         percentage=(total_marks/5);
        System.out.println("the percentage is "+" "+percentage);
        if ((percentage>=75) && (percentage<=100))
            System.out.println("grade is A+");
        else if ((percentage<75) && (percentage>=60))
            System.out.println("garde is A ");
        else if ((percentage>60)&&(percentage>45))
            System.out.println("grade is B");
        else if (percentage>=30 && percentage<=45)
            System.out.println("grade is C");
        else {
            System.out.println("Sorry...failed....!");
        }



    }

}