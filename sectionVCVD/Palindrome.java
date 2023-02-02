import java.util.Scanner;

public class Palindrome{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = s.next();
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result = result+str.charAt(i);
        }
        System.out.println("Reverse of "+str+" is "+result);
        if(result.equals(str)){
            System.out.println(str+" is palindrome.");
        }
        else{
            System.out.println(str+" is not palindrome.");
        }
    }
}