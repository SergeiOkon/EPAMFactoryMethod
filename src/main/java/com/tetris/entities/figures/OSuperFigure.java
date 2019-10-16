package com.tetris.entities.figures;

import com.tetris.entities.Figure;

public class OSuperFigure extends Figure {
    private static boolean[][] OSuperShape = {
            {true, true, true, true},
            {true, true, true, true},
            {true, true, true, true},
            {true, true, true, true},
    };

    public OSuperFigure() {
        super(OSuperShape);
    }
}