package com.graphic.editor.shapes;

public class IllegalArgumentException extends Exception {
    IllegalArgumentException() {
        super("Radius can't be lower than zero");
    }
}
