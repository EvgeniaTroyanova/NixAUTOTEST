package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/*1 В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
2 В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
3 В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего
  целого и выводящую результат на экран.
4 Даны три переменные a, b и c. Изменить значения этих переменных так, чтобы в a хранилось значение a+b, в b хранилась разность
  старых значений c−a, а в c хранилось сумма старых значений a+b+c.
  Например, a=0, b=2, c=5, тогда новые значения a=2, b=5 и c=7.*/

public class Task3 {

    public void method1(int q, int w){
        System.out.println("q/v="+q/w +", remainder of the division q on w is "+q%w);
    }
    public int method2(int n){
        return n/10+n%10;
    }
    public long method3(double n){
        return Math.round(n);
    }

    public void method4(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input integers a, b, c");
        Integer a=new Integer(scanner.nextInt());
        Integer b=new Integer(scanner.nextInt());
        Integer c=new Integer(scanner.nextInt());
        b=a+b;
        c=c+b;
        b=c-b-a;
        a=c-b-a;
        System.out.println("a="+a+", b="+b+", c="+c);
    }
    public  static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Task3 task3=new Task3();

        System.out.println("Subtask1. Input integers q & w");
        task3.method1(scanner.nextInt(),scanner.nextInt());

        System.out.println("Subtask2. Input integer n and you will get sum of numbers ");
        System.out.println(task3.method2(scanner.nextInt()));

        System.out.println("Subtask3. Input double n and get the closest int ");
        try {
            System.out.println(task3.method3(scanner.nextDouble()));
        }
        catch (InputMismatchException e){
            System.out.println("Oops!! You had to use a comma as a delimiter");
        }
        System.out.print("Subtask4.");
        task3.method4();

    }


}
