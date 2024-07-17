
package ztgs;

public class NumberToLetter {

    public static void main(String[] args) {
        int num = 499;
        if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println(convert(num));
        }
    }

    private static String convert(int num) {
        if (num < 20) {
            return units(num);
        } else if (num < 100) {
            return tens(num / 10) + ((num % 10 != 0) ? " " + units(num % 10) : "");
        } else if (num < 1000) {
            return units(num / 100) + " Hundred" + ((num % 100 != 0) ? " and " + convert(num % 100) : "");
        } else if (num < 10000) {
            return units(num / 1000) + " Thousand" + ((num % 1000 != 0) ? " " + convert(num % 1000) : "");
        } else {
            return "Number too large";
        }
    }

    private static String units(int num) {
        switch (num) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
            default: return "";
        }
    }

    private static String tens(int num) {
        switch (num) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return "";
        }
    }
}
