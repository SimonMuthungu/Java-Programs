package JavaSystem;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main extends Thread {
    public static void main(String[] args) {

        // trying to run threads by using the threads way
        Main thread = new Main();
        thread.start();

        LocalTime todaysTime = LocalTime.now();
        LocalDateTime todaysdat = LocalDateTime.now();
        DateTimeFormatter formatteddt = DateTimeFormatter.ofPattern("E, MMM dd yyyy, HH:mm:ss");

        String formatteddateandtime = todaysdat.format(formatteddt);


        System.out.println();
        System.out.println("->Hello User, Im glad you are here.");
        System.out.println("->I was created to do some random stuff by Simon... Heres a list of things i can do...");

        System.out.print(" 1 - Show todays time to the finest details: ");
        System.out.println(todaysTime);
        System.out.print(" 2 - Show todays date and time to the finest details: ");
        System.out.println(todaysdat);

        System.out.print(" 3 - Show a well formatted version of todays date and time: ");
        System.out.println(formatteddateandtime);
    }

    public void run()
    {
        System.out.println("This is how you run a thread. It can be helpful in parallel programming!");
    }
}
