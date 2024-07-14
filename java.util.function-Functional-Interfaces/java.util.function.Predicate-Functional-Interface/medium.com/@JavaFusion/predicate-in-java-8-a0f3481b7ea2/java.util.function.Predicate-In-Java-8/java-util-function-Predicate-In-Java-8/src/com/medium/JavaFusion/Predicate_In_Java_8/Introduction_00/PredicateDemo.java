package com.medium.JavaFusion.Predicate_In_Java_8.Introduction_00;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.logging.Logger;

/**
 * @author ramumsrk
 * @since 2024/07/14
 */
public class PredicateDemo {
  private static final Logger LOGGER =
    Logger.getLogger(PredicateDemo.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  public static void main(String... args) {
      List<Integer> listOfNaturalNumbers = Arrays.<Integer>asList(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10
      );
      Predicate<Integer> evenNumberPredicate =
        (Integer sampleInputNumber) -> sampleInputNumber % 2 == 0;
      for (var sampleInputNumber : listOfNaturalNumbers) {
        if (evenNumberPredicate.test(sampleInputNumber)) {
          LOGGER.info(
            String.format(
              "'%d' is an even number\n",
              sampleInputNumber
            )
          );
        }
      }
    return;
  }
}
