package com.sai.objects;

/**
 * @author cb-prasanna
 */
public class SubOperation implements Operation {
    @Override
    public int process(int a, int b) {
        return a-b;
    }
}
