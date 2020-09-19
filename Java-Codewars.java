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

public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    String repeatedString = "";
    for (int i = 0; i < repeat; i++){
      repeatedString += string;
    }
      return repeatedString;
  }
}