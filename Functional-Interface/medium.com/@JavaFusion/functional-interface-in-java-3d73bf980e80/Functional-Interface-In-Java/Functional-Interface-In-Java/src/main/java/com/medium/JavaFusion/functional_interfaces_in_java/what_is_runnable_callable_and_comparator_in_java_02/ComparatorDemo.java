package com.medium.JavaFusion.functional_interfaces_in_java.what_is_runnable_callable_and_comparator_in_java_02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class ComparatorDemo {
  private static final Logger LOGGER =
    Logger.getLogger(ComparatorDemo.class.getName());
  // Java program execution starts
  // from built-in `main()' method
  static public void main(String... args) {
      List<String> listOfNames = Arrays.<String>asList(
        "Muna",
        "Kuna",
        "Runa"
      );
      LOGGER.info(
        String.format(
          "%s\n",
          "Before sorting"
        )
      );
      for (var name : listOfNames) {
        LOGGER.info(
          String.format(
            "Name: '%s'\n",
            name
          )
        );
      }
      Comparator<String> namesComparator = (String string,
                                            String anotherString) -> string.compareTo(anotherString);
      Collections.sort(listOfNames, namesComparator);
      LOGGER.info(
        String.format(
          "%s\n",
          "After sorting"
        )
      );
      for (var name : listOfNames) {
        LOGGER.info(
          String.format(
            "Name: '%s'\n",
            name
          )
        );
      }
    return;
  }
} 