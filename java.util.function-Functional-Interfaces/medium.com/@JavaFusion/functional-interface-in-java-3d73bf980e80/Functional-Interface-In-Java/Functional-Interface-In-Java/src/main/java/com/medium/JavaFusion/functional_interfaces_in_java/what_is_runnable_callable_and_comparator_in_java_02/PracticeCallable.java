package com.medium.JavaFusion.functional_interfaces_in_java.what_is_runnable_callable_and_comparator_in_java_02;

import java.util.concurrent.Callable;

public class PracticeCallable implements Callable<Integer> {
  @Override
  public Integer call() {
    return        Integer.valueOf(42);
  }
}
