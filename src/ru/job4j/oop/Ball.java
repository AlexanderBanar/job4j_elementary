package ru.job4j.oop;

public class Ball {
    public void singBallSong() {
        System.out.println("Я Колобок, я Колобок, я от бабушки ушел, я от дедушки ушел!");
    }

    public void ballSongForRun() {
        System.out.println("И от тебя уйду!");
    }

    public void runFromHare(Hare hare) {
        System.out.println("Не ешь меня, Заяц, я тебе песенку спою!");
    }

    public void runFromWolf(Wolf wolf) {
        System.out.println("Не ешь меня, Волк, я тебе песенку спою!");
    }

    public void singToFox(Fox fox) {
        System.out.println("Песенка колобка");
    }
}
