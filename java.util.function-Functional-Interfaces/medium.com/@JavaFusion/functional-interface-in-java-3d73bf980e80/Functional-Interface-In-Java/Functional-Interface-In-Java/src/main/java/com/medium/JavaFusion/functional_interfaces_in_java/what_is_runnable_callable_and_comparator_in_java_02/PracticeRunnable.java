package com.medium.JavaFusion.functional_interfaces_in_java.what_is_runnable_callable_and_comparator_in_java_02;

import java.util.logging.Logger;

public class PracticeRunnable implements Runnable {
  private static final Logger LOGGER =
    Logger.getLogger(PracticeRunnable.class.getName());
  @Override
  public void run() {
      LOGGER.info(
        String.format(
          "%s\n",
          "Implementing the run() method of java.lang.Runnable interface"
        )
      );
    return;
  }
}
