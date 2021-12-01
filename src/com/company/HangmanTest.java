package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HangmanTest {

    public static void main(String[] args) {

        String hangmanWort = "duschkopf";
        game(hangmanWort);
    }

    public static void game (String hangmanWort) {
        //Später eigene Funktion "Initialize" mit rng Wörtern
        int leben = 10;
        int wordcount = hangmanWort.length();
        System.out.println("Das Wort hat " + wordcount + " Buchstaben.");

        char[] lösung = {'d','u', 's', 'c', 'h', 'k', 'o', 'p', 'f'};

        char[] gaming = {'*','*','*','*','*','*','*','*','*'};


        Scanner hangman = new Scanner(System.in);

        //Hier startet später ein Loop! - später eigene Funtion!
        char[] usedWords = new char[26];
        int q = 0;

        while (leben > 0 & wordcount > 0) {
            System.out.println(Arrays.toString(gaming));
            System.out.println("Bitte gebe einen Buchstaben ein! Viel Glück!");
            String s = hangman.next();
            char a = s.charAt(0);
            boolean notUsed = true;


            for (int i=0; i<=q; i++){
                if (usedWords[i] == a){
                    notUsed = false;
                    break;
                }
            }
            if (hangmanWort.contains(Character.toString(a)) && notUsed) {
                //Was passiert nun? = Checken welcher Buchstabe getroffen wurde -> Array "umschalten" (hoffentlich klappt das)-> Wordcount subtrahieren -> loop neu starten!
                usedWords[q] = a;
                q++;
                wordcount--;
                int z = 0;
                while (z < hangmanWort.length()) {
                    if (lösung[z] == a) {
                        gaming[z] = lösung[z];
                        z++;
                    } else {
                        //Loop neu starten!
                        z++;
                    }
                }
            }else if (!notUsed){
                System.out.println("You already guessed " + a);
            }
            else {
                usedWords[q] = a;
                q++;
                leben--;
                System.out.println("You lost one life!");
                System.out.println(leben + " remaining!");
            }

        }
        if (leben == 0){
            System.out.println("GAME OVER!");
        }else if (wordcount == 0){
            System.out.println("Victory!");
        }
    }














}
