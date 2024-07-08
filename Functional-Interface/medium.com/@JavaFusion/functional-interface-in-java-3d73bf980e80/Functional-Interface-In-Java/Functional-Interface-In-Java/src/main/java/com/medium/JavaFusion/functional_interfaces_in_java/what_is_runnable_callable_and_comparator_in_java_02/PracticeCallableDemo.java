package com.medium.JavaFusion.functional_interfaces_in_java.what_is_runnable_callable_and_comparator_in_java_02;

import java.util.concurrent.*;
import java.util.logging.Logger;

public class PracticeCallableDemo {
  private static final Logger LOGGER =
    Logger.getLogger(PracticeCallable.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  public static void main(String[] args) {
      Callable<Integer> callable = new PracticeCallable();
      ExecutorService executorService = Executors.newSingleThreadExecutor();
      Future<Integer> future = executorService.submit(callable);
      Integer result = null;
      try {
        result = future.get();
      } catch (InterruptedException | ExecutionException interruptedExecutionException) {
        interruptedExecutionException.printStackTrace();
      } finally {
        LOGGER.info(
          String.format(
            "Result: '%d'\n",
            result
          )
        );
        executorService.shutdown();
      }
    return;
  }
}
