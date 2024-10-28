package conv;

import java.util.List;

public class Converter {
    // Numbers
    public int add(int a, int b) {
        // Add a and b together
        return a + b;
    }

    public int addPositive(int a, int b, int c) {
        // Add a, b and c together, but don't add them to the total if they're negative
        if (a < 0) {
            a = 0;
        }
        if (b < 0) {
            b = 0;
        }
        if (c < 0) {
            c = 0;
        }
        return a + b + c;
    }

    public int addList(List<Integer> list) {
        // Add all numbers in list together, using a for loop
        int sum = 0;
        for (int abcdefg = 0; abcdefg < list.size(); abcdefg ++) {
            int theThing = list.get(abcdefg);
            sum = sum + theThing;
    }
    return sum;
    }

    // Strings
    public int getStringLength(String s) {
        // Return the length of the string
        return s.length();
    }

    public String sign(int a) {
        // Return "positive" if a is positive, "negative" if a is negative, and "zero" if a is zero
        if (a < 0) {
            return "negative";
        }
        if (a > 0) {
            return "positive";
        }
        if (a == 0) {
            return "zero";
        }
        return null;
    }

    public int countHellos(List<String> list) {
        // Count how many times the word "hello" appears in the list
        int helloAmount = 0;
        for (int idx=0; idx < list.size(); idx ++) {
        String value = list.get(idx);
        if (value.equals("hello")) {
            helloAmount ++;
        }
    }
    return helloAmount;
    }


    // Boolean
    public boolean invert(boolean b) {
        // Return the opposite of b (if true return false, if false return true)
        // You should be able to do it in only one line of code!
        return !b;
    }

    public boolean isEven(int a) {
        // Return true if a is even, false if a is odd
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Numbers (more complex)
    public int addListWhile(List<Integer> list) {
        // Add all numbers in list together, using a while loop
        int sum = 0;
        int index = 0;
        while (index < list.size()) {
            index ++;
            sum = sum + list.get(index);
        }
        return sum;
    }

    public int addPositiveList(List<Integer> list) {
        // Add only positive numbers in list together (ignore negative numbers)
        int sum = 0;
        for (int asdlkj = 0; asdlkj < list.size(); asdlkj ++) {
            int value = list.get(asdlkj);
            if(value >= 0){
                sum = sum + value;
            }
        }
        return sum;
    }
}

