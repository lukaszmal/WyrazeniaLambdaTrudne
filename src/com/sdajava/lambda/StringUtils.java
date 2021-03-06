package com.sdajava.lambda;

public class StringUtils {
  public static String betterString(String s1, String s2,
                                    TwoStringPredicate tester) {
    if(tester.isBetter(s1, s2)) {
      return(s1);
    } else {
      return(s2);
    }
  }

  private StringUtils() {} // Uninstantiatable class; contains only static methods.
}
