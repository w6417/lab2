package com.company;

public class Human {
    int Age;
    int Weight;
    int Height;
    String Name;
    String Gender;

    public int getAge() {
        return Age;
    }

    public int getWeight() {
        return Weight;
    }

    public int getHeight() {
        return Height;
    }

    public String getName() {
        return Name;
    }

    public boolean isMale() {
        if(Gender=="Male")
        return true ;
        else return false;
    }
}
