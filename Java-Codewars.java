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

// import java.util.Scanner;

// public class Solution {

//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     int i = scan.nextInt();
//     double d = scan.nextDouble();
//     scan.nextLine();
//     String s = scan.nextLine();
//     scan.close();

//     System.out.println("String: " + s);
//     System.out.println("Double: " + d);
//     System.out.println("Int: " + i);
//   }
// }

// HackerRank Java Loops II Solution:

// import java.util.*;
// import java.io.*;

// class Solution{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t=in.nextInt();
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();

//             for(int j=0; j<n; j++){
//                 a += b;

//                 if (j>0){
//                     System.out.print(" ");
//                 }
//                 System.out.print(a);
//                 b = b*2;
//             }
//             System.out.println(" ");
//         }
//         in.close();
//     }
// }

// In a factory a printer prints labels for boxes. For one kind of boxes
// the printer has to use colors which, for the sake of simplicity, are
// named with letters from a to m.

// The colors used by the printer are recorded in a control string. For
// example a "good" control string would be aaabbbbhaijjjm meaning that
// the printer used three times color a, four times color b, one time
// color h then one time color a...

// Sometimes there are problems: lack of colors, technical malfunction
// and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm
// with letters not from a to m.

// You have to write a function printer_error which given a string will
// return the error rate of the printer as a string representing a
// rational whose numerator is the number of errors and the denominator
// the length of the control string. Don't reduce this fraction to a
// simpler expression.

// The string has a length greater or equal to one and contains only
// letters from ato z.

// Examples:
// s="aaabbbbhaijjjm"
// error_printer(s) => "0/14"

// s="aaaxbbbbyyhwawiwjjjwwm"
// error_printer(s) => "8/22"

public class Printer {

  public static String printerError(String s) {
    int count = 0;
    String[] arr = s.split("");
    int length = s.length();
    String errors = "nopqrstuvwxyz";
    String[] error_array = errors.split("");
    int error_array_length = errors.length();
    for (int i=0; i<length; i++){
      for (int j=0; j<error_array_length; j++){
        if (arr[i].equals(error_array[j])){
          count += 1;
        }
      }
    }
    return count + "/" + length;
  }
}

// best practice

public class Printer {
    
  public static String printerError(String s) {
      return s.replaceAll("[a-m]", "").length() + "/" + s.length();
  }
}
