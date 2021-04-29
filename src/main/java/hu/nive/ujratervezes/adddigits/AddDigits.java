package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int sum = 0;
        char character;
        int n;

        if(input == null || input.isEmpty()) return -1;

        for (int i = 0; i < input.length(); i++) {
            character = input.charAt(i);
            if(Character.isDigit(character)) {
                n = Character.getNumericValue(character);
                sum += n;
            }
        }

        return sum;
    }
}
