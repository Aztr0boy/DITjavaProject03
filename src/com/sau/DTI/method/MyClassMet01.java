package com.sau.DTI.method;

public class MyClassMet01 {
    //method คือ Function คือการทำงานๆหนึง ที่จะไม่ทำงานหากไม่เรียกใช้(Call method)
    public static void showHi( ){
        System.out.println("Hi......");

    }

    public static void showHey( ) {
        System.out.println("Hey.....");
    }

    public static void main(String[] args) {
        showHi();
        showHey();
    }

    public static void showWhat( ) {
        System.out.println("What....");
        showWhat();
    }
}
