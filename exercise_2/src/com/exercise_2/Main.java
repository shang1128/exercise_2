package com.exercise_2;

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


    }
}