import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the sentence");
        String input = sc.nextLine();
        boolean isPangram = checkIfPangram(input.toLowerCase());
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean checkIfPangram(String input) {
        boolean[] alphabetOccurrence = new boolean[26];

        for (char c : input.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                int index = c - 'a';
                alphabetOccurrence[index] = true;
            }
        }
        for (boolean occurred : alphabetOccurrence) {
            if (!occurred) {
                return false;
            }
        }

        return true;
    }
}
