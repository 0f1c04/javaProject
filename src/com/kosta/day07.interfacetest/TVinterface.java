package com.kosta.day07.interfacetest;

//interface: 규격서
public interface TVinterface {
    //1. 상수 (변경불가)
    public static final String CHANNEL5 = "SBS"; //public static final 생략가능
    String CHANNEL7 = "KBS";

    //2. 추상 메소드
    public abstract void powerOn(); //public abstract 생략가능
    void powerOff();

    //3. default 메소드
    //4. static 메소드
}
