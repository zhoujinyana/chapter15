package com.zjyedu.generic;

import java.util.ArrayList;

public class CustomMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("xi",100);
        car.fly(300.1,100);

        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);

    }
}
class Car{
    public void run(){

    }
    public <T,R> void fly(T t,R r){
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }


}
class Fish<T,R>{
    public void run(){

    }
    public <U,M> void eat(U u,M m){

    }
    //不是泛型方法，而是hi方法使用了类声明的泛型
    public void hi(T t){

    }
    public <K> void hello(R r,K k){
        System.out.println(r.getClass());
        System.out.println(k.getClass());

    }
}