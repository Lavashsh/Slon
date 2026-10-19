import java.util.Scanner;

public class SlonCli {

    public static void main(String[] args) {
        Slon slon = new Slon();
        Scanner scanner = new Scanner(System.in);

        System.out.println(slon.greeting());

        while (scanner.hasNextLine()) {
            String response = slon.handle(scanner.nextLine());
            if (response == null) {
                break;
            }
            System.out.println(response);
        }

        scanner.close();
    }
}