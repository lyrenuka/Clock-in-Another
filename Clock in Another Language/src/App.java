public class App {
    public static void main(String[] args) throws Exception {
        Clock myClock = new Clock(); // Initialise a clock object

        // Call Tick method to increase time for one second
        myClock.Tick();

        // Display the time
        System.out.printf("%nTime : %s (one second)", myClock.GetTime());

        // tick for one minute
        for (int i = 0; i < 59; i++)
            myClock.Tick();

        // Display the time
        System.out.printf("%nTime : %s (one minute)", myClock.GetTime());

        // tick for one hour
        for (int i = 0; i < 3540; i++)
            myClock.Tick();

        // Display the time
        System.out.printf("%nTime : %s (one hour)", myClock.GetTime());

        // tick for 24 hour
        for (int i = 0; i < 82800; i++)
            myClock.Tick();

        // Display the time
        System.out.printf("%nTime : %s (twenty four hours)", myClock.GetTime());

        for (int i = 0; i < 8515; i++)
            myClock.Tick();

        // reset the clock
        myClock.Reset();

        // Display the time
        System.out.printf("%nTime : %s (after reset)%n%n", myClock.GetTime());
    }
}
