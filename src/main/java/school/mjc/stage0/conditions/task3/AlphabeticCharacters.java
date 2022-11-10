package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'y') {
            System.out.println("Vowel");
        } else if (character == 'b' || character == 'c' || character == 'd' || character == 'f' || character == 'g' || character == 'h' || character == 'j' ||
                character == 'k' || character == 'l' || character == 'm' || character == 'n' || character == 'p' || character == 'q'
                || character == 'r' || character == 's' || character == 't' || character == 'v' || character == 'w'
                || character == 'x' || character == 'z') {
            System.out.println("Consonant");

        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
