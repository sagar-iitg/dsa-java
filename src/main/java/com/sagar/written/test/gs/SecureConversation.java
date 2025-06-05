package com.sagar.written.test.gs;

/*
 * Problem: Secure My Conversations
 *
 * Persons A and B use an encryption-based system for their conversations.
 * Each conversation message is encoded from the source and decoded at the destination
 * using a shared private positive number key known to both parties.
 *
 * The encryption algorithm works as follows:
 *
 *
 * Input Format:
 * 1. Operation (1 for Encoding, 2 for Decoding)
 * 2. Input message (String)
 * 3. Key (String containing digits)
 *
 * Output Format:
 * 1. Output message (String after encryption/decryption)
 *
 * Example 1 (Encoding):
 * Input:
 * 1
 * Open
 * 123
 * Output:
 * Oppeeen
 *
 * Example 2 (Decoding):
 * Input:
 * 2
 * Oppeeen
 * 123
 * Output:
 * Open
 */


class SecureConversation {

    public static String secureConversation(int operation, String message, String key) {
        StringBuilder result = new StringBuilder();
        int keyLength = key.length();

        if (operation == 1) {
            // Encoding
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                int repeat = key.charAt(i % keyLength) - '0';
                for (int j = 0; j < repeat; j++) {
                    result.append(ch);
                }
            }
        } else if (operation == 2) {
            // Decoding
            int i = 0;
            int msgLength = message.length();
            while (i < msgLength) {
                int repeat = key.charAt(result.length() % keyLength) - '0';
                result.append(message.charAt(i));  // Take 1 char
                i += repeat; // Skip ahead by repeat count
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
            // Test case 1: Encoding
            System.out.println(SecureConversation.secureConversation(1, "Open", "123")); // Output: Opppeeeennnn

            // Test case 2: Decoding
            System.out.println(SecureConversation.secureConversation(2, "Opppeeeennnn", "123")); // Output: Open

    }
}


