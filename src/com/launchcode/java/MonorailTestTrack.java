package com.launchcode.java;

import static com.launchcode.java.HairColor.*;
import java.util.Scanner;
import java.lang.Exception;
import java.math.MathContext;


public class MonorailTestTrack {
    HairColor hairColor = YELLOW;

    public MonorailTestTrack() {

    }

    //Day 19 method

    public static void sumOfNumberPlusFactors() {
        System.out.println("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        AdvanceArithmetic myCalculator = new Calculator();
        int total = myCalculator.divisorSum(n);
        System.out.println("I implemented " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(total);
    }

    public static void alterEgo() {
        MonorailTestTrack bruceWayne = new MonorailTestTrack();
        MonorailTestTrack batMan = bruceWayne;  //aliasing = set one person to equal another

        batMan.hairColor = BROWN;

        System.out.println("Hair color of Bruce Wayne is " + bruceWayne.hairColor);
        System.out.println("Hair color of Batman is " + batMan.hairColor);
    }

    private static void swap(int a[], int element1, int element2) {
        int temp = a[element1];
        a[element1] = a[element2];
        a[element2] = temp;
    }

    private static int sortBubble(int a[], int n) {
        int totalSwaps = 0;
        for (int i = 0; i < n; i += 1) {
            int numberOfSwaps = 0;

            for (int j = 0; j < n - 1; j += 1) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps += 1;
                }
            }
            totalSwaps += numberOfSwaps;

            //if no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }
        }
        return totalSwaps;
    }

    public static int day20Challenge() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many elements are in the array?");
        int n = in.nextInt();
        System.out.println("Enter the numbers of the array");
        System.out.println("Press the carriage return key after entering each number.");
        int a[] = new int[n];
        for (int a_1 = 0; a_1 < n; a_1 += 1) {
            a[a_1] = in.nextInt();
        }
        int swapCount = sortBubble(a, n);
        System.out.println("Array is sorted in " + swapCount + " swaps.\n");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);

        return swapCount;
    }

    public static void day18Challenge() {     //is it a palindrome?
        System.out.println("Enter any kind of a word, and I'll tell you if or not it's a palindrome: ");
        Scanner scaninto = new Scanner(System.in);
        String input = scaninto.nextLine();
        scaninto.close();
        //Convert string into array of characters
        char[] s = input.toCharArray();
        //Create palindrome object
        Palindrome pl = new Palindrome();
        //Enqueue / push all chars to their respective data structure
        for (char see : s) {
            pl.pushTheCharacter(see);
            pl.enqueueTheCharacter(see);
        }
        /*
         * pop / dequeue the chars at the head of
         * both date structures and compare them
         * */

        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i += 1) {
            if (pl.popTheCharacter() != pl.deQueueTheCharacter()) {
                isPalindrome = false;
                break;
            }
        }
        //Print whether the string s is a palindrome
        System.out.println("The word " + input + ", is " + ((!isPalindrome) ? "not a palindrome" : "a palindrome."));
    }

    public static void day17Challenge(){       //try and catch; propogating exceptions
        Scanner sn = new Scanner(System.in);
        System.out.println("How many sets of integers would you like to calculate the exponent of?");
        int t = sn.nextInt();
        System.out.println("Enter the first two integers.");
        while (t-- > 0){

            int n = sn.nextInt();
            int p = sn.nextInt();
            Exponent myExponent = new Exponent();
            try {
                int ans = myExponent.powerOf(n, p);
                System.out.println("The answer is " + ans);
                if (t > 1) {
                    System.out.println("Enter the next two integers.");
                } else if (t == 1) {
                    System.out.println("Enter the last two integers.");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        sn.close();
    }
    public static void day16Challenge(){        //parse an integer from a string
        Scanner nn = new Scanner(System.in);
        System.out.println("Enter a string so I can try to convert it into an integer.");
        System.out.println("I'll inform you if there's a problem with converting it.");
        String S = nn.next();
        try{
            String numb = S;
            Integer number = Integer.parseInt(S);
            System.out.println("I converted it into the string: " + S);
        }
        catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }

    public static void main(String[] args) {
	// write your code here


        /*
        * calling method for Day 19; need
        * to uncomment it out in order to
        * run; see also Calculator Class
        * and AdvanceArithmetic Interface
        * */

        //sumOfNumberPlusFactors();

        //day 20 hackerRank lesson

        //alterEgo();

        //hackerRank day 20 challenge
        //day20Challenge();
        //day18Challenge();   //is it a palindrome?

        day17Challenge();     //try & catch blocks; exception propogating

        //day16Challenge();       //parse a string to an integer



    }
};
