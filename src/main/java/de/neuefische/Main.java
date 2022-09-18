package de.neuefische;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("checkLength");
        checkLength("1234dkslfjldsfjkl");
        checkLength("1234567");
        System.out.println("checkForDigits");
        checkForDigits("a3na1banalfkglksl9ijlkj");
        checkForDigits("klfdjslkgj45jfdhlkgfsddfsdfdsdfs");
        System.out.println("checkForUpperLowerCase");
        checkForUpperLowerCase("fisch");
        checkForUpperLowerCase("FISCH");
        checkForUpperLowerCase("Fisch");
        messageDialog(Boolean.toString(checkForUpperLowerCase(inputDialog())));
        JOptionPane.showMessageDialog(null, "passwordBlacklist");
        messageDialog(Boolean.toString(passwordBlacklist(inputDialog())));

    }

    public static String inputDialog(){
        return JOptionPane.showInputDialog("Eingabe");
    }

    public static void messageDialog(String s){
        JOptionPane.showMessageDialog(null, s);
    }

    public static boolean checkLength(String password){
        if(password.length()>7){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public static boolean checkForDigits(String password) {
        int count = 0;
        char[] chars = password.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) == true) {
                count++;
            }
        }
        //min. 3 digits
        if (count == 3) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean checkForUpperLowerCase(String password){
        if(password.toLowerCase()!=password&&password.toUpperCase()!=password){
            System.out.println(password+" is true");
            return true;
        }
        else {
            System.out.println(password+" is false");
            return false;
        }

    }

    public static boolean passwordBlacklist(String password){
        switch(password) {
            case "passwort123":
            case "123456789":
            case "abcdtest":
                return true;
            default: return false;
        }
    }

}