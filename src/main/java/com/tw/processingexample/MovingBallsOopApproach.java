package com.tw.processingexample;

import processing.core.PApplet;

import java.util.ArrayList;

// Main method to draw the actual balls
public class MovingBallsOopApproach extends PApplet {

    private final int WINDOW_WIDTH = 640;
    private final int WINDOW_HEIGHT = 480;
    ArrayList<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("com.tw.processingexample.MovingBallsOopApproach");
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        balls = new ArrayList<>();
        initializeBalls();
    }

    private void initializeBalls() {
        for (int iterator = 0; iterator < 4; iterator++) {
            balls.add(new Ball(0, (iterator + 1) * WINDOW_HEIGHT / 5, 15, iterator + 1, this));
        }
    }

    @Override
    public void draw() {
        balls.forEach(Ball::drawBall);
        balls.forEach(Ball::moveBall);
    }
}
