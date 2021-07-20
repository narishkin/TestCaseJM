import java.util.TreeMap;

public class RomanHelper {
    private final static TreeMap<Integer, String> map = new TreeMap<>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }
    private static int RomanToDecTable(char letter) {
        switch (letter) {
            case 'M':
                return 1000;
            case 'D':
                return 500;
            case 'C':
                return 100;
            case 'L':
                return 50;
            case 'X':
                return 10;
            case 'V':
                return 5;
            case 'I':
                return 1;
            default:
                return 0;
        }
    }
    public static int convertToDec(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length() - 1; i++) {
            if (RomanToDecTable(roman.charAt(i)) < RomanToDecTable(roman.charAt(i + 1))) {
                result -= RomanToDecTable(roman.charAt(i));
            } else {
                result += RomanToDecTable(roman.charAt(i));
            }
        }
        result += RomanToDecTable(roman.charAt(roman.length() - 1));
        return result;
    }

    public static String decToRoman(int number) {
        int absNumber = Math.abs(number);
        int l =  map.floorKey(absNumber);
        if ( absNumber == l ) {
            return map.get(absNumber);
        }
        return map.get(l) + decToRoman(absNumber-l);
    }
}
