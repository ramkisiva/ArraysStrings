import java.util.Scanner;
public class StringCompression {
    public static void main(String[] args){
        System.out.println("***** Simple  string compression using counts of repeated characters *****");
        System.out.print(" Enter a string to compress::");
        Scanner sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        System.out.println(compressString(s1));
    }
    private static String compressString(String str){
        int i =1;
        int count = 1;
        StringBuilder sbuilder = new StringBuilder();
        int compressLength = 0;
        while(i<str.length()){
            if (str.charAt(i)==str.charAt(i-1)){
                count ++;
            }
            else{
                //compressLength = compressLength +2
                compressLength = compressLength +1+String.valueOf(count).length();
                if(compressLength>=str.length()){
                    return str;
                }
                sbuilder.append(str.charAt(i-1)).append(count);
                count = 1;
            }
            i++;
        }
        //check to see if adding the last character of the string exceeds length of original string
        if(compressLength +1+String.valueOf(count).length() < str.length() ){
            sbuilder.append(str.charAt(i-1)).append(count);
            return sbuilder.toString();
        }
        return str;
            
    }
}