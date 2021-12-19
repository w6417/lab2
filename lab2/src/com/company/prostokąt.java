package com.company;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class prostokąt {
    int dlugosc;
    int szerokosc;

    public prostokąt(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int pole(){
      int a= dlugosc*szerokosc;
       return a;
    }

    public int obwód(){
        int a=2*(dlugosc+szerokosc);
        return a;
    }
    public double dlugoscprzekatnej(){
      double a= pow(dlugosc,2) + pow(szerokosc,2);
        return sqrt(a);
    }
}
