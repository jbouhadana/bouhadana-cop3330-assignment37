/*
 *  UCF COP3330 Summer 2021 Assignment 37 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
            Scanner jb = new Scanner(System.in);
            System.out.print("What's the minimum length? ");
            int length = Integer.parseInt(jb.nextLine());

            System.out.print("How many special characters? ");
            int characters = Integer.parseInt(jb.nextLine());

            System.out.print("How many numbers? ");
            int numbers = Integer.parseInt(jb.nextLine());

            System.out.println("Your password is " + createPassword(length, characters, numbers));
        }

        public static String createPassword(int length, int characters, int number)
        {
            String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String specialChars = "!@#-_+`~$%^&*";
            String numbers= "1234567890";

            Random rand = new Random();
            ArrayList<Character> sonk = new ArrayList<>();
            for(int i=0; i<characters; i++){
                sonk.add(specialChars.charAt(rand.nextInt(specialChars.length())));
            }

            for(int i=0; i<number; i++){
                sonk.add(numbers.charAt(rand.nextInt(numbers.length())));
            }

            for(int i=sonk.size()-1; i<length; i++){
                sonk.add(letters.charAt(rand.nextInt(letters.length())));
            }

            Collections.shuffle(sonk);
            String password = "";
            for(Character s : sonk)
            {
                password += Character.toString(s);
            }
            return password;
        }
    }

