package com.company;

public class okrąg {
    double promień;
    Punkt Środek;
    double średnica;


    public double getPowierzchnia() {
        return Math.PI * Math.pow(promień, 2);
    }

    public double getśrednica() {
        return promień * 2;
    }

    public double getPromień() {
        return promień;
    }

    public String wśrodku(int x, int y) {
        Punkt środek = new Punkt(3, 4);
        if (Math.pow((x - środek.wspX), 2) + (Math.pow((y - środek.wspY), 2)) < (Math.pow(promień, 2)))
            return "Wprowadzony punkt znajduje się w środku okręgu";

        else
            return "Wprowadzony punkt jest poza okręgiem";

    }

    public okrąg() {
        this.promień = promień;
        this.Środek.wspY = Środek.wspY;
        this.Środek.wspX = Środek.wspX;
    }

    public okrąg(int x, int y, int promień) {
        this.promień = promień;
        this.Środek.wspY = y;
        this.Środek.wspX = x;
    }

    public okrąg(int x, int y, double średnica) {

        this.Środek.wspY = y;
        this.Środek.wspX = x;
        this.średnica = średnica;

    }

    public static okrąg getokrąg1(int x, int y) {
        prostokąt p1 = new prostokąt(x, y);
        double g = Math.pow(x, 2) + Math.pow(y, 2);
        double k = Math.sqrt(g); //przekątna prostokąta i jednocześnie średnica okręgu
        return new okrąg(3, 4, k);
    }
    public static okrąg getokrąg2(int x, int y) {
        prostokąt p1 = new prostokąt(x, y);
        double g = y; // szerokość prostokąta to to samo co średnica okręgu
        return new okrąg(3, 4, g);
    }
}