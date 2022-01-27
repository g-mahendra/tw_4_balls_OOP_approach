package com.tw.processingexample;

import processing.core.PApplet;

public class Ball {
    private int xCoordinate;
    private int yCoordinate;
    private int diameter;
    private int speed;
    private PApplet drawingHelper;

    Ball(int xCoordinate, int yCoordinate, int diameter, int speed, PApplet drawingHelper) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.speed = speed;
        this.diameter = diameter;
        this.drawingHelper = drawingHelper;
    }

    public void drawBall() {
        drawingHelper.ellipse(this.xCoordinate, this.yCoordinate, this.diameter, this.diameter);
    }

    public void moveBall() {
        this.xCoordinate += this.speed;
    }
}

