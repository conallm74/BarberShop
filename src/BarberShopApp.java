import java.util.Scanner;
public class BarberShopApp {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        LoginDetails checkDetails = new LoginDetails();

        String email = "";

        System.out.println("enter your email address");
        email = myInput.nextLine();

        checkDetails. verifiesEmail();
    }
}