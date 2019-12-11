package com.julia;

import java.util.Arrays;

public class StringPerformanceTester {

    private String forConcat;

    public StringPerformanceTester(String forConcat) {
        this.forConcat = forConcat;
    }

    public long perform(ConcatTextInterface concatenator, int count) {
        String[] texts = createArray(count);
        long now = System.currentTimeMillis();
        concatenator.concatenate(texts);
        return System.currentTimeMillis() - now;
    }



    private String[] createArray(int count) {
        String[] res = new String[count];
        Arrays.fill(res, forConcat);   //зполняет все элементы
        return res;
    }
}