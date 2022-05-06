package com.dzhenetl;

@FunctionalInterface
public interface OnTaskErrorListener {

    void onError(String message);
}
