import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int originalNumber = scanner.nextInt();

        // encrypt the original number
        int encryptedNumber = encrypt(originalNumber);

        // Display the encrypted number
        System.out.println("Encrypted number: " + encryptedNumber);

    }
    public static int encrypt(int number){
        int digit1 = (number % 1000 / 100 + 7) % 10;
        int digit2 = (number % 100 / 10 + 7) % 10;
        int digit3 = (number % 10 + 7) % 10;
        int digit4 = (number % 1000 + 7) % 10;

        return digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
    }
}
