package com.company;

public class MyNumber {
    double a;

    public MyNumber(double a) {
        this.a = a;
    }

    public boolean isOdd(){
        if(a%2==1)
            return true;
        else return false;

    }
    public boolean isEven(){
        if(a%2==0)
            return true;
        else return false;

    }
    public double sqrt(){
       return Math.sqrt(a);
    }
    public MyNumber pow(MyNumber x){
        return new MyNumber(Math.pow(a, x.a));
    }

    public MyNumber add(MyNumber x){
        return new MyNumber(a + x.a);
    }
    public MyNumber substract(MyNumber x){
        return new MyNumber(a - x.a);
    }
}
