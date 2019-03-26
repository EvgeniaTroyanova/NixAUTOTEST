package com.company;
/*Создать еще один класс Main2 с методом main(String[] args), который при запуске выводит в консоль “Hello, world!”.
        В Main2 классе подключить этот пакет, и вначале программы запросить имя человека, присвоить его переменной
        класса Hello, потом поприветствовать его, в конце - попрощаться перед закрытием программы. Между ‘hello’ и ‘bye’
        будет ваше “Hello, world!”.*/


import java.util.Scanner;
import com.welcome.*;

public class Main2 {

    public  static void main(String[] args){
        System.out.println("Enter the name please");
        Scanner scanner=new Scanner(System.in);
        Hello hello=new Hello(scanner.next());
        hello.welcome();
        System.out.println("Hello, world!");
        hello.byeBay();
    }
}
