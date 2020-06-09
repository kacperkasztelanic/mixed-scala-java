package com.kkasztel.scalajava.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void squareCorrectly() {
        App app = new App();
        Assertions.assertEquals(25, app.square(5));
    }
}
