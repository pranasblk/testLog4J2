package net.orangecap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog {
  private void log() {
    Logger log = LoggerFactory.getLogger(getClass());
    log.info("Hello log4j Async");
  }

  public static void main(String[] args) {
    System.err.println(System.getProperty("java.class.path"));
    TestLog fixture = new TestLog();
    fixture.log();
  }
}
