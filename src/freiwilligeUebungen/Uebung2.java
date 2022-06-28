package freiwilligeUebungen;

public class Uebung2 {

    public static void main(String[] args) {


        int number = 18;
        convertToRomanNumeral(number);

    }
    private static void convertToRomanNumeral(int number) {
        String[] romanNumerals = {"M", "CM" ,"D","CD","C", "XC","L","XL","X",  "IX", "V","IV","I"};
        char[] decimalNumerals = {1000, 900, 500, 400, 100, 90,  50,  40,    10,  9,    5,     4,     1};

        if (number >= 4000 || number < 0)
            return;

        StringBuilder romanNumber = new StringBuilder();
        while (number > 0)
            for (int i = 0; i < romanNumerals.length; i++)
                if (number/decimalNumerals[i] > 0) {
                    romanNumber.append(romanNumerals[i]);
                    number -= decimalNumerals[i];
                }
        System.out.println(romanNumber);
    }
}

