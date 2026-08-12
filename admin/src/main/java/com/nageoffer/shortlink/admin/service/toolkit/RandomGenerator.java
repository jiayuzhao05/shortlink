package com.nageoffer.shortlink.admin.service.toolkit;


/**
 * random ggenerator groupby ID
 */
public final class RandomGenerator {

    private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * generate unique groupby ID
     *
     * @return 分组ID
     */
    public static String generateRandom() {
        return generateRandom(6);
    }

    /**
     * generate unique groupby ID
     * @param length 生成多少位
     * @return 分组ID
     */
    public static String generateRandom(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String randomString = generateRandomString(6);
        System.out.println(randomString);
    }
}
