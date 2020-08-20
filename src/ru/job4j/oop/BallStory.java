package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.singBallSong();
        hare.tryEat(ball);
        ball.runFromHare(hare);
        ball.singBallSong();
        ball.ballSongForRun();
        wolf.tryEat(ball);
        ball.runFromWolf(wolf);
        ball.singBallSong();
        ball.ballSongForRun();
        fox.tryEat(ball);
        ball.singBallSong();
        fox.tryEat2(ball);
        ball.singBallSong();
        fox.tryEat3(ball);
        ball.singBallSong();
        fox.foxEatBall(ball);
    }
}
