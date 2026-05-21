package com.example;
public class App {
    public int add(int a, int b) {return a + b; }
    public int subtract(int a, int b) {return a - b; }
    public int multiply(int a, int b) {return a * b; }
    public int divide(int a, int b) {
        if ( b==0 ) throw new ArithmeticException ("Divide by zero");
        return a / b;
    }
    public static void main(String[] args) {
         App calc = new App();
        System.out.println("May tinh dang hoat dong!");
        System.out.println("=================================================");
        System.out.println("Ket qua thuat toan may tinh");
        System.out.println("Ket qua phep cong 10 + 5 = " + calc.add(10, 5));
        System.out.println("Ket qua phep tru 10 - 7 = " + calc.subtract(10, 7));
        System.out.println("Ket qua phep nhan 10 * 4 = " + calc.multiply(10, 4));
        System.out.println("=================================================");
    }
}
