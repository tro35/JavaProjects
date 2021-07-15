public class SecondsInDay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        int remainingHours = 24 - currentHours;
        int remainingMinutes = 60 - currentMinutes;
        int remainingSeconds = 60 - currentSeconds;

        int minutesSeconds = remainingMinutes * 60;
        int hoursSeconds = (remainingHours * 60) * 60;

        int resultSeconds = minutesSeconds + hoursSeconds + remainingSeconds;

        System.out.println(resultSeconds);
    }
}
