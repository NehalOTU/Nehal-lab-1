package com.ontariotechu.sofe3980U;

public class Binary {
    private String value;

    // Constructor
    public Binary(String value) {
        this.value = value;
    }

    // Getter
    public String getValue() {
        return value;
    }

    // ADD two binaries
    public static Binary add(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        int sum = num1 + num2;
        return new Binary(pad(sum, b1.value.length(), b2.value.length()));
    }

    // OR
    public static Binary or(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        return new Binary(pad(num1 | num2, b1.value.length(), b2.value.length()));
    }

    // AND
    public static Binary and(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        return new Binary(pad(num1 & num2, b1.value.length(), b2.value.length()));
    }

    // MULTIPLY
    public static Binary multiply(Binary b1, Binary b2) {
        int num1 = Integer.parseInt(b1.value, 2);
        int num2 = Integer.parseInt(b2.value, 2);
        int product = num1 * num2;
        return new Binary(pad(product, b1.value.length(), b2.value.length()));
    }

    // Helper: pad binary string with leading zeros
    private static String pad(int num, int len1, int len2) {
        int maxLen = Math.max(len1, len2);
        String bin = Integer.toBinaryString(num);
        while (bin.length() < maxLen) {
            bin = "0" + bin;
        }
        return bin;
    }
}
