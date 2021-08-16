import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Meeting {
    public static void main(String[] args) {
        String result = extractAndSort("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill");
        System.out.println(result);
    }
    public static String extractAndSort(String s) {
        List<FirstNameAndLastname> sortedNames = new ArrayList<>();
        for (String s1 : s.split(";")) {
            String toUpperCase = s1.toUpperCase();
            FirstNameAndLastname firstNameAndLastName = swapFirstNameLastName(toUpperCase);
            sortedNames.add(firstNameAndLastName);
        }
        sortedNames.sort(Comparator.comparing(FirstNameAndLastname::getLastName).thenComparing(FirstNameAndLastname::getFirstName));
        StringBuilder sb = new StringBuilder();
        for (FirstNameAndLastname firstNameAndLastName : sortedNames) {
            String format = firstNameAndLastName.toString();
            sb.append(format);
        }
        return sb.toString();
    }

    private static FirstNameAndLastname swapFirstNameLastName(String personName) {
        String[] split = personName.split(":");
        String firstName = split[0];
        String lastName = split[1];
        return new FirstNameAndLastname(firstName, lastName);
    }


    private static class FirstNameAndLastname{
        private final String firstName;
        private final String lastName;

        public FirstNameAndLastname(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public String toString() {
            return String.format("(%s, %s)", this.lastName, this.firstName);
        }
    }


}
