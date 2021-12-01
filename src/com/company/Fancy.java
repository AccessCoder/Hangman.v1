package com.company;

public class Fancy {


    public static void istLang(String a) {
        if (a.length() > 20) {
            System.out.println("String ist länger als 20 Zeichen");
        } else
            System.out.println("String ist kürzer als 20 Zeichen");
    }

    public static boolean isFancy(String a){
        if (a.contains("fancy")){
            System.out.println("String ist fancy, yay!");
            return true;
        }else
            System.out.println("String ist leider nicht fancy");
            return false;
    }

    public static void doubleCheck (String a){
        istLang(a);
        isFancy(a);
    }

    public static void main(String[] args) {
        String test = "hahalalalalaFancyhalahahahahtagtagtagtagtag";
        istLang(test);
        isFancy(test);

        doubleCheck(test);

        boolean fancyOderNicht = isFancy(test);
        if (fancyOderNicht){
            System.out.println("String ist fancy, yay!");
        }else
            System.out.println("String ist leider nicht fancy");
    }








}

