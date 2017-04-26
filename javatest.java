public class javatest {
    public static void main(String[] args) {
        String originalString = "abcdefg";
        String resultString = "";
        char[] charArray = originalString.toCharArray();
        for (int i = charArray.length-1; i>=0; i--){
                resultString +=charArray[i];
            }
        System.out.println(resultString);
     }
}