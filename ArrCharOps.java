public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }


    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

 
    public static char charAt(char[] arr, int index) {
        return arr[index];
    }


    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length){
            return false;
        }
    
        for (int i = 0; i < arr1.length ; i++){
            if (charAt(arr2, i) != charAt(arr1, i)) {
                return false;
            }
        }
        return true;
    }


    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length ; i++){
            if (charAt(arr, i) == ch){
                return i;
            }
        }
        return -1;
    }

     
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length ; i++){
            if (charAt(arr, i) == ch){
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        
        for (int i = arr.length - 1; i >= 0 ; i--){
            if (charAt(arr, i) == ch){
                return i;
            }
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char[] result = new char[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length ; i++){
        result[i] = charAt(arr1, i);
        }
        for (int i = 0; i < arr2.length ; i++){
        result[arr1.length + i] = charAt(arr2, i);
        }
        return result;
    }

  
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char[] subArry = new char[endIndex - beginIndex +1];
        for (int i = beginIndex; i < endIndex; i++){
            subArry[i - beginIndex] = charAt(arr, i);
        }
        return subArry;
    }


    public static long hashCode(char[] arr) {
        int n = arr.length;
        long hash = 0;
        for (int i = 0 ; i < n ; i++){
            hash =  7 * hash + arr[i];
        }
        return hash;
    }


    public static int compareTo(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());

        for (int i = 0; i < len ; i++){
            if (str1.charAt(i) > str2.charAt(i)){
                return 1;
            }
            if (str1.charAt(i) < str2.charAt(i)){
                return -1;
            } 
        }
        
        if (str1.length() > str2.length()) {
                return 1;
            }
        if (str1.length() < str2.length()){
                return -1;
            }

            return 0;
        }
    }
    

