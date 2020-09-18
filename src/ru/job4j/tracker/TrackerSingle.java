package ru.job4j.tracker;

public class TrackerSingle {
    public Tracker single1() {
        Tracker tracker1 = TrackerSingle1.INSTANCE.getTracker();
        return tracker1;
    }

    public Tracker single2() {
        Tracker tracker2 = TrackerSingle2.getInstance().getTracker();
        return tracker2;
    }

    public Tracker single3() {
        Tracker tracker3 = TrackerSingle3.getInstance().getTracker();
        return tracker3;
    }

    public Tracker single4() {
        Tracker tracker4 = TrackerSingle4.getInstance().getTracker();
        return tracker4;
    }
}
