package es2;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str;
        System.out.println("insert a text: ");

        while(true) {
            str = input.nextLine();
            if(str.contains(":q")) {

                // remove every whitespace
                String newStr = str.replaceAll("\\s+", "");

                // remove ":q" before conversion
                charSeparetor(newStr.substring(0, newStr.length() - 2));
                break;
            }
        }

        // System.out.println("you closed " + str);
        input.close();
    }
    public static void charSeparetor(String str) {
        String output = "";
        for(char ch: str.toCharArray()) {
           output += ch + ",";
        }

        output = output.substring(0, output.length() - 1);
        System.out.println("result: " + output);
    }
}
