package com.tetris.entities;

public class Figure {

    private boolean[][] shape;

    public Figure(boolean[][] shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        StringBuilder resB = new StringBuilder();
        for (boolean[] aShape : shape) {
            for (boolean anAShape : aShape) {
                resB.append(anAShape ? "■" : " ");
            }
            resB.append("\n");
        }
        return resB.toString();
    }
}
