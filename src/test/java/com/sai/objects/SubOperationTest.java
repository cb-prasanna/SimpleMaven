package com.sai.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author cb-prasanna
 */
class SubOperationTest {
    @Test
    void processAdd() {
        Operation op = new SubOperation();
        int processed = op.process(2, 4);
        assertEquals(-2, processed);
    }
}