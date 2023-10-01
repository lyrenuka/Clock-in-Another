import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clock {

    private Counter seconds;
    private Counter minutes;
    private Counter hours;

    public Clock() {
        seconds = new Counter("Seconds");
        minutes = new Counter("Minutes");
        hours = new Counter("Hours");
    }

    public void Tick() {
        seconds.Increment();
        if (seconds.GetValue() >= 60) {
            minutes.Increment();
            seconds.Reset();
        }

        if (minutes.GetValue() >= 60) {
            hours.Increment();
            minutes.Reset();
        }

        if (hours.GetValue() >= 24) {
            Reset();
        }
    }

    public String GetTime() {
        LocalTime time = LocalTime.of(hours.GetValue(), minutes.GetValue(),
                seconds.GetValue());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }

    public void Reset() {
        seconds.Reset();
        minutes.Reset();
        hours.Reset();
    }
}