package com.sai.objects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/** @author cb-prasanna */
class AddOperationTest {
  @Test
  void processAdd() {
    Operation op = new AddOperation();
    int processed = op.process(2, 4);
    assertEquals(6, processed);
  }
}
