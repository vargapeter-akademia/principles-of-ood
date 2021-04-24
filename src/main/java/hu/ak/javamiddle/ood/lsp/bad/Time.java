package hu.ak.javamiddle.ood.lsp.bad;

public class Time {
    public static final long HOUR_IN_MILLIS = 3_600_000;
    public static final int MAX_HOURS = 24;
    public static final int SECOND_IN_MS = 1_000;
    public static final int MINUTE_IN_SEC = 60;
    public static final int MINUTE_IN_MILLIS = 60_000;
    public static final int MAX_MINUTES = 60;

    private long timeInMillis;

    public long getTimeInMillis() {
        return timeInMillis;
    }

    public void setTimeInMillis(long timeInMillis) {
        this.timeInMillis = timeInMillis;
    }

    public int getHours() {
        return (int) (timeInMillis / HOUR_IN_MILLIS) % MAX_HOURS;
    }

    public int getMinutes() {
        return  (int) (timeInMillis % HOUR_IN_MILLIS / MINUTE_IN_MILLIS) % MAX_MINUTES;
    }

}
