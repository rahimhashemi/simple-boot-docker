package com.example.demo;

import org.junit.jupiter.api.Test;


public class FakeIntegrationTestsIT {

    @Test
    public void someFakeTestOne() throws Exception {
        System.out.println("Test 1 .");

        Thread.sleep(100);

        System.out.println("Test 1 . .");

        Thread.sleep(100);

        System.out.println("Test 1 . .");

        Thread.sleep(100);

        System.out.println("Test 1 . . .");

        Thread.sleep(100);

        System.out.println("Test 1 . . . .");

        Thread.sleep(100);

        System.out.println("Test 1 . . . . .");
    }

    @Test
    public void someFakeTestTwo() throws Exception {
        System.out.println("Test 2 .");

        Thread.sleep(100);

        System.out.println("Test 2 . .");

        Thread.sleep(100);

        System.out.println("Test 2 . .");

        Thread.sleep(100);

        System.out.println("Test 2 . . .");

        Thread.sleep(100);

        System.out.println("Test 2 . . . .");

        Thread.sleep(100);

        System.out.println("Test 2 . . . . .");
    }
}
