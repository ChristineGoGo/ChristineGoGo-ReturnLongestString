import java.util.Arrays;
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        // return null;
        int[] result = new int[arr.length];
        String ResultingString = "";
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i].length();
        }
        Arrays.sort(result);
        int longest = result[arr.length - 1];

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i].length() == longest) {
                ResultingString = arr[i];
            }
        }
        return ResultingString;
    }
}
