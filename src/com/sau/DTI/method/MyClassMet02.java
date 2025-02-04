package com.sau.DTI.method;

public class MyClassMet02 {
    //ประเภทของ Method มี 4 ประเภท
    //1. no parameter no return
    public static void showWOW( ) {
        System.out.println("WOW WOW WOW");
    }
    //2. Have parameter no return
    public static void sumNumber(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    //3. no parameter have return
    public static String showWell( ) {
        return" Well Well Well";
    }
    //4 have parameter have return
    public static double calPowNumber(int a ,int b) {
        return Math.pow(a,b);
    }

    public static void main(String[] args) {
        showWell();
        showWell();
        sumNumber(20,30); //ตัวที่ส่งให้ parameter เรียกว่า Argument
        sumNumber(200 , 300);


        //--------------------------------------------------

        System.out.println(showWell());
        String data = showWell();
        System.out.println(data + "Hmmm");

        System.out.println(calPowNumber(50,2));
        double result = calPowNumber(5,3);
        System.out.println("5^3 = "+ result );


    }
}
