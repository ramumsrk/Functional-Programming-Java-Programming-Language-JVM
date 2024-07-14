package com.medium.kulkarnishruti.functional_interfaces_review_java_util_function_Function.usage_examples_04.basic_example_04_01;

import java.util.function.Function;
import java.util.logging.Logger;

public class FunctionDemo {
  private static final Logger LOGGER =
    Logger.getLogger(FunctionDemo.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  static public void main(String[] args) {
      Function<String, Integer> functionThatTakesAStringAsInputAndReturnsAnIntegerAsOutput = String::length;
      LOGGER.info(
        String.format(
          "Length of '%s' is '%d'\n",
          "Hello",
          functionThatTakesAStringAsInputAndReturnsAnIntegerAsOutput.apply(
            "Hello")
        )
      );
    return;
  }
}