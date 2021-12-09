public class Concatenation {
    public static void main(String[] args) {
        String str1 = "dop";
        String str2 = "erwt";
        String str3 = "en";
        String result;
        String alternative;

        // Concateneer str1, str2 en str3 en assign aan result
        result = str1 + str2 + str3;
        alternative = str1.concat(str2).concat(str3);
        // print string result
        System.out.println(result);
        System.out.println(alternative);

    }
}
