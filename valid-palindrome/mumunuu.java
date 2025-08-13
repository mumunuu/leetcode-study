class Solution {

    public static boolean isPalindrome(String s) {


        StringBuilder cleaned = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                continue;
            }
            cleaned.append(Character.toString(c).toLowerCase());

        }

        if (cleaned.isEmpty() || cleaned.length() == 1) {
            return true;
        }



        for (int i=0; i<cleaned.length()/2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(cleaned.length()-1-i)) {
                return false;
            }
        }
        return true;


    }
}
