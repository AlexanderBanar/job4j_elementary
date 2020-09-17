package ru.job4j.tracker;

public class TrackerSingle {
    public TrackerSingle1 single1() {
        TrackerSingle1 tracker1 = TrackerSingle1.INSTANCE;
        return tracker1;
    }

    public TrackerSingle2 single2() {
        TrackerSingle2 tracker2 = TrackerSingle2.getInstance();
        return tracker2;
    }

    public TrackerSingle3 single3() {
        TrackerSingle3 tracker3 = TrackerSingle3.getInstance();
        return tracker3;
    }

    public TrackerSingle4 single4() {
        TrackerSingle4 tracker4 = TrackerSingle4.getInstance();
        return tracker4;
    }
}
