import java.util.Random;
import java.util.ArrayList;
public class PuzzleJava {
    public static ArrayList<Integer> getTenRolls() {
        Random rand = new Random();
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            rolls.add(rand.nextInt(11));
        }
        return rolls;
    }
    public static char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // System.out.println(alphabet);
        Random rand = new Random();
        return alphabet[rand.nextInt(26)];
    }

    public static String generatePassword() {
        String password = "";
        for (int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }
    public static ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }
}