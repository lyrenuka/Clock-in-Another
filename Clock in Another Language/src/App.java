public class App {
    public static void main(String[] args) throws Exception {
        Clock myClock = new Clock(); // Initialise a clock object

        // Call Tick method to increase time for one second
        myClock.Tick();

        // Display the time in sec
        

        // tick for one minute
        

        // Display the time in min
        

        // tick for one hour
        

        // Display the time in  hours
        

        // tick for 24 hour
        

        // Display the time in twenty four hours
        

        for (int i = 0; i < 8515; i++)
            myClock.Tick();

        // reset the clock
        myClock.Reset();

        // Display the time
        System.out.printf("%nTime : %s (after reset)%n%n", myClock.GetTime());
    }
}
