package com.sai.objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** @author cb-prasanna */
class SubOperationTest {
  @Test
  void processAdd() {
    Operation op = new SubOperation();
    int processed = op.process(2, 4);
    assertEquals(-2, processed);
  }
}
