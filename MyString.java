public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    public static String lowerCase(String str) {
        if (str == null) {
            return null;
        }
        String newStr = "";
        char ch;
        for (int i = 0 ; i < str.length() ; i ++){
            ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                newStr = newStr + (char)(ch + 32);
            }
            else {
                newStr = newStr + ch;
            }
        }
        return newStr;
    }
 
    public static boolean contains(String str1, String str2) {
        int len2 = str2.length();
        boolean contains = false;
        if (str1.length() >= str2.length()){
            for (int i = 0; i <= (str1.length() - str2.length()); i++) {
                String newStr1 = str1.substring(i, i+ len2);
                if (newStr1.equals(str2)){
                    contains = true;
                    break;
                }
            }
        }
        return contains;
    }
}
