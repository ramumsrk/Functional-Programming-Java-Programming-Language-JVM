package com.medium.JavaFusion.functional_interfaces_in_java.what_is_runnable_callable_and_comparator_in_java_02;

public class PracticeRunnableDemo {
  // Java program execution starts from
  // built-in `main()' method
  static public void main(String... args) {
      Runnable runnable = new PracticeRunnable();
      Thread thread = new Thread(runnable);
      thread.start();
    return;
  }
}
