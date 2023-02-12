package Assignment;

import java.util.Scanner;


public class CaesarCipher {
	public static void encrypt(String plaintext,int key) {
		if (key < 0) {
            System.out.println("INVALID INPUT");
            return;
        }
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                ch = (char) (ch + key);
            } else if (Character.isDigit(ch)) {
                ch = (char) (ch + key);
            }
            encryptedText.append(ch);
        }
        System.out.println("Encrypted text: " + encryptedText);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your plaintext: ");
        String plaintext = sc.nextLine();
        System.out.print("Enter the key: ");
        int key = sc.nextInt();

      encrypt(plaintext, key);
        
    }
}
