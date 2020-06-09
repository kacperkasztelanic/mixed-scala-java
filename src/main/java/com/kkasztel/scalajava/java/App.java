package com.kkasztel.scalajava.java;

import com.kkasztel.scalajava.scala.Squarer;
import com.kkasztel.scalajava.scala.SquarerImpl;

public class App {

    public int square(int n) {
        Squarer squarer = new SquarerImpl();
        return squarer.square(n);
    }
}
