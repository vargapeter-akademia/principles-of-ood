package hu.ak.javamiddle.ood.lsp.bad;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {

    @Test
    public void testTime() {
        Time time = new Time();

        testGeneralBehavior(time);
    }

    @Test
    public void testZonedTime() {
        ZonedTime time = new ZonedTime();
        time.setOffset(-1);

        testGeneralBehavior(time);
    }

public void testGeneralBehavior(Time time) {
    long hoursInMillis = 10 * Time.HOUR_IN_MILLIS;
    long minutesInMillis = 54 * Time.MINUTE_IN_MILLIS;

    time.setTimeInMillis(hoursInMillis + minutesInMillis);

    if (time instanceof ZonedTime) {
        ZonedTime zonedTime = (ZonedTime) time;

        assertEquals(10 + zonedTime.getOffset(), time.getHours());
        assertEquals(54, time.getMinutes());
    } else {

        assertEquals(10, time.getHours());
        assertEquals(54, time.getMinutes());
    }
}

}