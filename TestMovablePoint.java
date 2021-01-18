package com.company.oop2;

public class TestMovablePoint {

    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.setSpeed(12, 16);
        movablePoint.move();
        System.out.println(movablePoint);
    }

}
