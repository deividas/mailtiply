package com.github.deividasp.mailtiply.util;

public class RandomUtils {

    public static int randomInt(int min, int max) {
        return (int) (Math.random() * max + min);
    }

    public static char randomChar(char from, char to) {
        return (char) (randomInt((int) from, (int) to));
    }

    public static String randomString(int minLength, int maxLength) {
        StringBuilder stringBuilder = new StringBuilder();

        int randomLength = randomInt(minLength, maxLength);

        while (stringBuilder.length() < randomLength) {
            char randomCharacter = randomChar('0', 'z');

            if (!Character.isLetterOrDigit(randomCharacter))
                continue;

            stringBuilder.append(randomCharacter);
        }

        return stringBuilder.toString();
    }

}
