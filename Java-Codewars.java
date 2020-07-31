// We need a function that can transform a number into a string
// What ways of achieving this do you know?
// 8kyu
// 7/30/2020
// Examples:
Kata.numberToString(123) // returns "123"
Kata.numberToString(999) // returns "999"

class Kata {
  public static String numberToString(int num) {
    return Integer.toString(num);
  }
}
// best practice
class Kata {
  public static String numberToString(int num) {
    return String.valueOf(num);
  }
}

// In this simple assignment you are give a number and have to make it
// negative. But maybe the number is already negative?
// Example:
Kata.makeNegative(1) // returns -1
Kata.makeNegative(-5) // returns -5
Kata.makeNegative(0) // returns 0
// 8kyu
// 7/31/2020

public class Kata {

  public static int makeNegative(final int x) {

    return (x < 0) ? x : -x;

  }

}

// best practice

import static java.lang.Math.abs;

public class Kata {

  public static int makeNegative(final int x) {
    return -abs(x);
  }
  
}