package algo.kingsley.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumPnemonics
{
    private static final Map<Integer, String> keypad = new HashMap<>();
    static {
        keypad.put(0, "0");
        keypad.put(1, "1");
        keypad.put(2, "abc");
        keypad.put(3, "def");
        keypad.put(4, "ghi");
        keypad.put(5, "jkl");
        keypad.put(6, "mno");
        keypad.put(7, "pqrs");
        keypad.put(8, "tuv");
        keypad.put(9, "wxyz");
    }

    public ArrayList<String> phoneNumberMnemonics(String phoneNumber) {

        return new ArrayList<String>();
    }
}
