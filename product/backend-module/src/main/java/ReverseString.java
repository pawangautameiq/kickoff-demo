public class ReverseString {

    /**
     * @param requestedString
     * @return
     */
    public String reverseOfAString(String requestedString) {
        if (requestedString == null || requestedString.trim().length() == 0) {
            return requestedString;
        }

        char[] charArray = requestedString.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            stringBuilder.append(charArray[i]);

        }
        return stringBuilder.toString();
    }

}
