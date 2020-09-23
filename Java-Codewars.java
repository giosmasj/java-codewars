// We need a function that can transform a number into a string
// What ways of achieving this do you know?
// 8kyu
// 7/30/2020
// Examples:
// Kata.numberToString(123) // returns "123"
// Kata.numberToString(999) // returns "999"

// class Kata {
//   public static String numberToString(int num) {
//     return Integer.toString(num);
//   }
// }
// best practice
// class Kata {
//   public static String numberToString(int num) {
//     return String.valueOf(num);
//   }
// }

// In this simple assignment you are give a number and have to make it
// negative. But maybe the number is already negative?
// Example:
// Kata.makeNegative(1) // returns -1
// Kata.makeNegative(-5) // returns -5
// Kata.makeNegative(0) // returns 0
// 8kyu
// 7/31/2020

// public class Kata {

//   public static int makeNegative(final int x) {

//     return (x < 0) ? x : -x;

//   }

// }

// best practice

// import static java.lang.Math.abs;

// public class Kata {

//   public static int makeNegative(final int x) {
//     return -abs(x);
//   }
  
// }

// Vowels Count Kata
// 7kyu
// 8/4/2020
// Return the number (count) of vowels in the given string.
// We will consider a, e, i, o, u as vowels but not y.
// The input string will only consist of lower case letters and/or spaces.

// public class Vowels {

//   public static int getCount(String str) {
//     int vowelsCount = 0;
//     for (int i = 0; i < str.length(); i++){
//       if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
//         vowelsCount++;
//       }
//     }
//     vowelsCount;
//   }

// }

// Best Practice, very clever but don't know if I would've gone that route

// public class Vowels {

//   public static int getCount(String str) {
//     return str.replaceAll("(?i)[^aeiou]", "").length();
//   }

// }

// Write a function called repeat_str which repeats the given string src exactly count times.

// repeatStr(6, "I") // "IIIIII"
// repeatStr(5, "Hello") // "HelloHelloHelloHelloHello"

// public class Solution {
//   public static String repeatStr(final int repeat, final String string) {
//     String repeatedString = "";
//     for (int i = 0; i < repeat; i++){
//       repeatedString += string;
//     }
//       return repeatedString;
//   }
// }

// Write a function to convert a name into initials. This kata strictly
// takes two words with one space in between them.

// The output should be two capital letters with a dot separating them.

// It should look like this:

// Sam Harris => S.H

// Patrick Feeney => P.F

// public class AbbreviateTwoWords {

//   public static String abbrevName(String name) {
//     String[] fullName = name.split(" ");
//     return (fullName[0].substring(0, 1) + "." + fullName[1].substring(0, 1)).toUpperCase();
//   }
// }

// best practice

// public class AbbreviateTwoWords {

//   public static String abbrevName(String name) {
//     String[] names = name.split(" ");
//     return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase()
//   }
// }

// Given the triangle of consecutive odd numbers:

//              1
//           3     5
//        7     9    11
//    13    15    17    19
// 21    23    25    27    29
// ...
// Calculate the row sums of this triangle from the row index (starting at
// index 1) e.g.:

// rowSumOddNumbers(1); // 1
// rowSumOddNumbers(2); // 3 + 5 = 8

// class RowSumOddNumbers {
//   public static int rowSumOddNumbers(int n) {
//     return n*n*n;
//   }
// }

// HackerRank Java Stdin and Stdout II

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();
    scan.close();

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}