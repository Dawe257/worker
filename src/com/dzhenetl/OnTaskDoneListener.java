package com.dzhenetl;

@FunctionalInterface
public interface OnTaskDoneListener {

    void onDone(String result);
}
