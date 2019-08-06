package com.labs.zemoso;

import java.util.Scanner;

public class AtoZ {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        String input = sc.nextLine();
        boolean ans = containsAtoZ(input);

        System.out.println(ans);
    }

    public static boolean containsAtoZ(String input)
    {
        input = input.toLowerCase(); //since it is given case-insensitive, converted the given ip into lowercase
        //System.out.println("input in lowercase: " + input);
        char ch = 'a';
        for(int i=1;i<=26;i++)     // searches for each letter, if it is present in the input string or not
        {
            if(input.indexOf(ch)==-1)
            {
                return false;
            }
            ch++;
        }

        return true;

    }

}

//space complexity: O(n), n is the length of the string
//time complexity: O(26*n),  n is the length of the string