package com.tw.processingexample;

import processing.core.PApplet;

import java.util.ArrayList;

// Class to define structure of an individual ball
class Ball {
    int xCoordinate;
    int yCoordinate;
    int ballHeight;
    int ballWidth;

    Ball(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.ballWidth = 15;
        this.ballHeight = 15;
    }
}

// Class to initialize constants and list of balls
class DrawMovingBalls extends PApplet {
    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;
    ArrayList<Ball> listOfBalls = new ArrayList<Ball>();

    DrawMovingBalls() {
        for (int iterator = 0; iterator < 4; iterator++) {
            Ball ballObject = new Ball(0, (iterator + 1) * WINDOW_HEIGHT / 5);
            listOfBalls.add(ballObject);
        }
    }
}

// Main method to draw the actual balls
public class MovingBallsOopApproach extends DrawMovingBalls {

    public static void main(String[] args) {
        PApplet.main("com.tw.processingexample.MovingBallsOopApproach");
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        drawBall();
        moveBalls();
    }

    private void drawBall() {
        for (Ball ball : listOfBalls) {
            ellipse(ball.xCoordinate, ball.yCoordinate, ball.ballWidth, ball.ballHeight);
        }
    }

    private void moveBalls() {
        for (int iterator = 0; iterator < 4; iterator++) {
            int xCoordinate = listOfBalls.get(iterator).xCoordinate;
            int yCoordinate = listOfBalls.get(iterator).yCoordinate;
            xCoordinate += iterator + 1;
            listOfBalls.set(iterator, new Ball(xCoordinate, yCoordinate));
        }
    }
}
