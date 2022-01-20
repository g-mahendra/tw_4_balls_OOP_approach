package com.tw.processingexample;

import processing.core.PApplet;

class DrawMovingBalls extends PApplet {
    public static final int WINDOW_WIDTH = 640;
    public static final int WINDOW_HEIGHT = 480;
    public static final int BALL_HEIGHT = 15;
    public static final int BALL_WIDTH = 15;
    float ballOneX = BALL_WIDTH / 2f;
    float ballTwoX = BALL_WIDTH / 2f;
    float ballThreeX = BALL_WIDTH / 2f;
    float ballFourX = BALL_WIDTH / 2f;
    float increment = 1f;
}

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
        drawBall(ballOneX, WINDOW_HEIGHT/5f);
        ballOneX+=increment;
        drawBall(ballTwoX, 2*WINDOW_HEIGHT/5f);
        ballTwoX+=increment*2;
        drawBall(ballThreeX, 3*WINDOW_HEIGHT/5f);
        ballThreeX+=increment*3;
        drawBall(ballFourX, 4*WINDOW_HEIGHT/5f);
        ballFourX+=increment*4;
    }

    private void drawBall(float xCoordinate, float yCoordinate){
        ellipse(xCoordinate, yCoordinate, BALL_WIDTH, BALL_HEIGHT);
    }
}
