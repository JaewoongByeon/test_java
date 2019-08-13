package otherpackage;

import java.util.ArrayList;

import otherpackage.otherclass.Fruits;

public class TryOuterClass {
    public static void main(String[] args) {
        ArrayList<Fruits> mFruitsList = new ArrayList<Fruits>();
        mFruitsList.add(new Fruits("Bad Fruits"));
        mFruitsList.add(new Fruits("Good Fruits"));
        for (Fruits t : mFruitsList) {
            System.out.println("Fruit: " + mFruitsList);
        }
    }
}