import java.util.Scanner;

public class Main {
    public static String textModifier() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i<str1.length(); i++) {
            if (i+1 != str1.length() && str1.charAt(i) == ' '
                    && str1.charAt(i+1) == ' '){
                continue;
            } else {
                str2.append(str1.charAt(i));
            }
        }
        StringBuilder str3 = new StringBuilder();
        for (int i=0; i<str2.length(); i++) {
            if (i+1 != str2.length() && str2.charAt(i) == '-'
                    && str2.charAt(i+1) == '-'){
                continue;
            } else {
                str3.append(str2.charAt(i));
            }
        }
        StringBuilder str4 = new StringBuilder();
        for(int i=0; i<str3.length(); i++){
            if((i+1 == str3.length() || i==0) && str3.charAt(i)=='-'){
                continue;
            } else if(i+2 != str3.length() && i+1 != str3.length()
                    && str3.charAt(i+1)=='-'){
                char ch = str3.charAt(i);
                char ch1 = str3.charAt(i+2);
                str4.append(ch1);
                str4.append(ch);
            } else if(i>1 && str3.charAt(i-1)=='-'){
                continue;
            }
            else if(str3.charAt(i)=='-'){
                continue;
            } else {
                str4.append(str3.charAt(i));
            }
        }
        StringBuilder str5 = new StringBuilder();
        int sum = 0;
        for(int i=0; i<str4.length(); i++){
            if(str4.charAt(i) == '0'||str4.charAt(i) == '1'||str4.charAt(i) == '2'
                    ||str4.charAt(i) == '3'|| str4.charAt(i) == '4'|| str4.charAt(i) == '5'
                    || str4.charAt(i) == '6'|| str4.charAt(i) == '7'|| str4.charAt(i) == '8'
                    || str4.charAt(i) == '9'){
                int ch = Character.getNumericValue(str4.charAt(i));
                sum += ch;
            } else {
                str5.append(str4.charAt(i));
            }
        }
        s = str5.toString();
        s = s.replace('+','!');
        String result = new String();
        if(sum!=0){
            result = s + " " + sum;
        } else {
            result = s;
        }
        return(result);
    }
    public static void main(String[] args) {
        System.out.println("Напишите что-нибудь и нажмите Enter!");
        System.out.println(textModifier());
    }
}