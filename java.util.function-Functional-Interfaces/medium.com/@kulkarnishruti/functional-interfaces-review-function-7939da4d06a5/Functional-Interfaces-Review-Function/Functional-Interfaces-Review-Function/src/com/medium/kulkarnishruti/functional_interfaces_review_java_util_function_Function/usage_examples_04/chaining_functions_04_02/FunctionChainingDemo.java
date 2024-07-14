package com.medium.kulkarnishruti.functional_interfaces_review_java_util_function_Function.usage_examples_04.chaining_functions_04_02;

import java.util.function.Function;
import java.util.logging.Logger;

/**
 * @author ramumsrk
 * @since 2024/07/14
 */
public class FunctionChainingDemo {
  private static final Logger LOGGER =
    Logger.getLogger(FunctionChainingDemo.class.getName());
  // Java program execution starts
  // from built-in `main()' method
  public static void main(String... args) {
      Function<String, Integer> lengthFunction = Integer::valueOf;
      Function<Integer, Integer> squareFunction =
        (sampleInputNumber) -> sampleInputNumber * sampleInputNumber;
      Function<String, Integer> lengthAndThenSquare =
        lengthFunction.andThen(squareFunction);
      LOGGER.info(
        String.format(
          "%s\n",
          lengthAndThenSquare.apply("45")
        )
      );
    return;
  }
}
