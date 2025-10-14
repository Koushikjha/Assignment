package StringI;

public class CountGiven {
    public static void main(String[] args) {
        String s="Take u forward is Awesome";
        int vowels = 0, consonants = 0, whitespaces = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels++;
            else if (ch >= 'a' && ch <= 'z')
                consonants++;
            else if (ch == ' ')
                whitespaces++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("White spaces: " + whitespaces);
    }
}
