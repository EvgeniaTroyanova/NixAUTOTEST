package com.welcome;

/*Создать отдельный пакет ‘com.welcome’. В нем создать класс Hello, туда добавить методы:
        setupName(String name) - присваивает внутренней private переменной имя человека,
        welcome() - формирует и выводит в консоль приветствие "Hello, %name%" (имя должно подставляться),
        byeBay() - прощается с выводом в консоль фразы "Bye, %name%"*/
public class Hello {
    private String name;

    public Hello(){
        name="Noname";
    }

   public Hello(String name){
        this.name=name;
    }

    public void setupName(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Hello, "+"%"+name+"%");
    }

    public void byeBay() {
        System.out.println("Bye, "+"%"+name+"%");
    }
}
