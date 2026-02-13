package lesson21.homework;

public class Main {
    public static void main(String[] args) {
        String input = "id:5501; name:  Ali  ; credit_card:4444-5555-6666-7777; role:admin;;;";
        System.out.println(clean(input));
    }

    public static String clean(String input) {
        String name = "UNKNOWN";
        String role = "UNKNOWN";
        String cardRaw = null;

        // 1) Split into parts by ';'
        String[] parts = input.split(";");

        // 2) For each part, extract key:value
        for (String part : parts) {
            part = part.trim();
            if (part.isEmpty()) continue;

            int sep = part.indexOf(':');
            if (sep == -1) continue; // no ':' => skip

            String key = part.substring(0, sep).trim();
            String value = part.substring(sep + 1).trim();

            if (key.equalsIgnoreCase("name")) {
                name = value;
            } else if (key.equalsIgnoreCase("role")) {
                role = value.toUpperCase();
            } else if (key.equalsIgnoreCase("credit_card")) {
                cardRaw = value;
            }
        }

        // 3) Build output using ONE StringBuilder
        StringBuilder out = new StringBuilder();
        out.append("User: [").append(name).append("] | Card: [");

        // 4) Normalize + mask card
        if (cardRaw != null) {
            // Normalize into exactly 4444-5555-6666-7777 (digits only)
            String digits = onlyDigits(cardRaw); // e.g. "4444555566667777"

            if (digits.length() == 16) {
                int start = out.length(); // card begins here

                // append normalized format
                out.append(digits, 0, 4).append('-')
                        .append(digits, 4, 8).append('-')
                        .append(digits, 8, 12).append('-')
                        .append(digits, 12, 16);

                // mask first 12 digits using indexing
                int[] maskPositions = {0,1,2,3, 5,6,7,8, 10,11,12,13};
                for (int p : maskPositions) {
                    out.setCharAt(start + p, '*');
                }

            } else {
                out.append("INVALID");
            }
        } else {
            out.append("INVALID");
        }

        out.append("] | Role: [").append(role).append("]");
        return out.toString();
    }

    // Helper: remove everything except digits
    private static String onlyDigits(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') sb.append(c);
        }
        return sb.toString();
    }
}
