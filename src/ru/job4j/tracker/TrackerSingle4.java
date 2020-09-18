package ru.job4j.tracker;

public class TrackerSingle4 {
    private TrackerSingle4() {
    }
    private final Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }

    public static TrackerSingle4 getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingle4 INSTANCE = new TrackerSingle4();
    }
}
