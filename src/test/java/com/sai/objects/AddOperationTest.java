package com.sai.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author cb-prasanna
 */
class AddOperationTest {
    @Test
    void processAdd() {
        Operation op = new AddOperation();
        int processed = op.process(2, 4);
        assertEquals(6, processed);
    }
}