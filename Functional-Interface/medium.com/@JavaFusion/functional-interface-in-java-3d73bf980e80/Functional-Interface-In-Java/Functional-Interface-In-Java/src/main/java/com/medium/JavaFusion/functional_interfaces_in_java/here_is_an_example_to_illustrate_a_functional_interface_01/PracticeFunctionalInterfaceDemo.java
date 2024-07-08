package com.medium.JavaFusion.functional_interfaces_in_java.here_is_an_example_to_illustrate_a_functional_interface_01;

import java.util.logging.Logger;

public class PracticeFunctionalInterfaceDemo {
  private static final Logger LOGGER =
    Logger.getLogger(PracticeFunctionalInterfaceDemo.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  public static void main(String[] args) {
      PracticeFunctionalInterface practiceFunctionalInterface = () -> LOGGER.info(
        String.format(
          "%s\n",
          "Default implementation of the one abstract method in the functional interface"
        )
      );
      practiceFunctionalInterface.theOnlyAbstractMethod();
      practiceFunctionalInterface.oneOfTheManyDefaultMethods();
      PracticeFunctionalInterface.oneOfTheManyStaticMethods();
    return;
  }
}
