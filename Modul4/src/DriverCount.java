import java.util.Scanner;

public class DriverCount {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        Scanner input = new Scanner(System.in);
        setDay day = new setDay();

        System.out.print("Masukan Hari : ");
        int countDay = input.nextInt();
        day.setDay(countDay);

        CountDay count = new CountDay(day.getDay());
    }
}