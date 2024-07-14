package com.medium.JavaFusion.functional_interfaces_in_java.here_is_an_example_to_illustrate_a_functional_interface_01;

import java.util.logging.Logger;

@FunctionalInterface
public interface PracticeFunctionalInterface {
  public static final Logger LOGGER =
    Logger.getLogger(PracticeFunctionalInterface.class.getName());
  // This is the only abstract method
  public abstract void theOnlyAbstractMethod();
  // This is one of the many default methods
  public default void oneOfTheManyDefaultMethods() {
      LOGGER.info(
        String.format(
          "%s\n",
          "Inside a default method"
        )
      );
    return;
  }
  // This is one of the many static methods
  public static void oneOfTheManyStaticMethods() {
      LOGGER.info(
        String.format(
          "%s\n",
          "Inside one of the many static methods"
        )
      );
    return;
  }
}
