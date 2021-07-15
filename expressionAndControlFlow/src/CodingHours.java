public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        //((float)(1+2) / (2+2) * 100)))
        double one = 52 *17;
        double two = 17*7*24;
        System.out.println("Attendee spent " + (5 * 17 * 6) + " hours by coding in semester");
        System.out.println("Percentage coding hours in semester: " + (one / two) * 100);
        System.out.println("Percentage coding hours in semester: " + ((float) (52*17) / (17*7*24) *100));

        //zaokrouhleni
        float f = 2.245612f;
        System.out.printf("%.0f", f);
    }
}
