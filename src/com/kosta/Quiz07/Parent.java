package com.kosta.Quiz07;
//6.
public class Parent {
    public String nation;

    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");
    }
    public Parent(String nation) {
        super();
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
