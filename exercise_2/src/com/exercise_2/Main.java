package com.exercise_2;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num1=20;
        int num2=10;

        //arithmetic operators
        System.out.println("arithmetic operators");
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+num1*num2);
        System.out.println(num1+" / "+num2+" = "+num1/num2);
        System.out.println(num1+" % "+num2+" = "+num1%num2);

        System.out.println("");

        //comparison operators
        System.out.println("comparison operators");
        System.out.println("first number: "+num1+" second number: "+num2);
        if (num1>num2){
            System.out.println("first number is greater than second number");
        }else if (num1<num2){
            System.out.println("first number is less than second number");
        }else if (num1>=num2){
            System.out.println("first number is greater than or equal to second number");
        }else if (num1<=num2){
            System.out.println("first number is less than or equal to second number");
        }else if (num1==num2){
            System.out.println("first number is equal to second number");
        }else if (num1!=num2){
            System.out.println("first number is not equal to second number");
        }

        System.out.println("");

        //assignment operation
        System.out.println("assignment operation");
        int num=8;

        num +=3;
        System.out.println(num);
        num -=3;
        System.out.println(num);
        num *=3;
        System.out.println(num);
        num /=3;
        System.out.println(num);
        num %=3;
        System.out.println(num);

        System.out.println("");

        //increment and decrement operators
        System.out.println("increment and decrement operators");
        int numberApple=5;
        numberApple++;
        System.out.println(numberApple);

        int numberOranges=5;
        numberOranges--;
        System.out.println(numberOranges);

        int incrementOperatorA=5;
        int incrementOperatorB=5;

        int incrementOperatorC=incrementOperatorA*incrementOperatorB++;
        System.out.println(incrementOperatorC);

        int incrementOperatorD=incrementOperatorA*--incrementOperatorB;
        System.out.println(incrementOperatorD);

        byte b2=127;
        b2 %=7;
        byte b3=120;
        b3 &=40;
        short s1=300;
        s1 ^=100;
        byte b4=127;
        b4 >>=3;
        System.out.println(b2);

        System.out.println("");

        //type casting
        System.out.println("type casting");

        byte number=5;
        /* widening castring
        byte -> short -> char -> int -> long -> float -> double */
        short myShort=9;
        double myDouble=myShort;

        System.out.println(myShort);
        System.out.println(myDouble);

         /* narrowing castring
        double -> float -> long -> int -> char -> short -> byte */
        double mysecondDouble=9.78;
        short mysecondShort=(short) mysecondDouble;

        System.out.println(mysecondDouble);
        System.out.println(mysecondShort);
        System.out.println("");
        // conditional statements
        System.out.println("conditional statement");

        if(20>10){
            System.out.println("20 is greater than 10");
        }
        //or
        int time=18;
        String result=(time<18)?"Good day.":"Good evening.";
        System.out.println(result);

        System.out.println("");

        int day=7;

        System.out.println("if else statement");
        if(day==1){
            System.out.println("Monday");
        }else if (day==2){
            System.out.println("Tuesday");
        }else if (day==3){
            System.out.println("Wednesday");
        }
        else if (day==4){
            System.out.println("Thursday");
        }else if(day==5){
            System.out.println("Friday");
        }
        else System.out.println("its another day");
        System.out.println("");
        //or
        System.out.println("or");
        String whatDay=(day==5)?"Friday":"its another day";
        System.out.println(whatDay);
        //or
        System.out.println("");
        System.out.println("switch case statement");
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("its another day");
        }

        //while loop
        System.out.println("");
        System.out.println("while loop");
        int x=1;

        while (x<=10){
            System.out.println("increment number"+x);
            x++;
        }
        //while loop exercise
        System.out.println("while loop exercise");
        System.out.println("problem: write a method with a while loop\n" +
                "        to prints 1 through n in square brackets.\n" +
                "        for example, if n=6 print.");
      int n=1;
        while (n<=6){
            System.out.print("["+n+"]");
            n++;
        }

        System.out.println("");
        //Scanner sc=new Scanner(System.in);
        //System.out.println("input number");
        System.out.println("option1 while loop with if else");
        int y=10;
        int m=1;
        int sum=0;
        String print="Sum = ";
        while (m<=y){
         if (m==y){
             print+=m;
         }else {
             print+=m+" + ";
         }
         sum+=m;
         m++;
        }
        System.out.println(print);
        System.out.println("Answer: "+sum);

        System.out.println("option2 while loop only");
        int a=5;
        int b=1;
        int ans=0;
        String msg="Sum = ";
        while (b<=a){
            msg+=b+" + ";
            ans+=b;
            b++;
        }
        System.out.println(msg);
        System.out.println("Answer : "+ ans); //need to fix

        System.out.println("");
        //write a method with a do while loop that generates an array of the first n even number; ex: input 5 - 2,4,6,8,10
        int numb=10;
        int numc=1;
        System.out.println("given number: "+ numb);
       numb*=2;
        do {
            if (numc%2==0) {
                System.out.print(numc + " ");
            }
            numc++;
        }while (numc<=numb);

        System.out.println("\n");
       // public void fibonacci() {
            System.out.println("Fibonacci sequence");
            //write a method with a for loop that generates the first n numbers in the fibonacci sequence ex: 1,1,2,3,5,8,13,21
            int j = 8;
            int k = 0;
            int l = 1;
            for (int i = 0; i <= j; i++) {
                System.out.print(k + " ");
                int sumOftwo = k + l;
                k = l;
                l = sumOftwo;

           // }
        }









    }
}
