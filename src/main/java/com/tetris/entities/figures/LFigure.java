package com.tetris.entities.figures;

import com.tetris.entities.Figure;

public class LFigure extends Figure{
    private static boolean[][] Lshape = {
            {true},
            {true},
            {true, true, true}
    };

    public LFigure() {
        super(Lshape);
    }
}
