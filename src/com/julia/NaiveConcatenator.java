package com.julia;

public class NaiveConcatenator implements ConcatTextInterface {

    public String concatenate(String[] texts) {
        String res = "";
        for (int i = 0; i < texts.length; i++) {
            res += texts[i];
        }
        return res;
    }
}
