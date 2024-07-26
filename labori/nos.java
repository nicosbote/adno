import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int year = 2023;
        int month = 1; // January

        LocalDate myDate = LocalDate.of(year, month, 1);
        System.out.println(myDate); // Output: 2023-01-01
    }
}
