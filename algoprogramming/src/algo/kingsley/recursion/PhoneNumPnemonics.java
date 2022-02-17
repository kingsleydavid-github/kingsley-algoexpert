package algo.kingsley.recursion;

import java.util.*;

public class PhoneNumPnemonics
{
    private static final Map<String, List<String>> keypad = new HashMap<>();
    static {
        keypad.put("2", Arrays.asList("a", "b", "c"));
        keypad.put("3", Arrays.asList("d", "e", "f"));
        keypad.put("4", Arrays.asList("g", "h", "i"));
        keypad.put("5", Arrays.asList("j", "k", "l"));
        keypad.put("6", Arrays.asList("m", "n", "o"));
        keypad.put("7", Arrays.asList("p", "q", "r", "s"));
        keypad.put("8", Arrays.asList("t", "u", "v"));
        keypad.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    public static void main(String[] args) {

        String currMnemomic = new String("0000000000");
        ArrayList<String> allCombinations = new ArrayList<>();

        allCombinations = phoneNumberMnemonics(0, "9578678338", currMnemomic, allCombinations);

    }

    public static ArrayList<String> phoneNumberMnemonics(int i, String phoneNumber, String currMnemomic, ArrayList<String> allCombinations) {

        ArrayList<String> combinations = new ArrayList<>();

        // 9 -

        return new ArrayList<String>();
    }
}
