package com.tetris.entities.figures;

import com.tetris.entities.Figure;

public class OFigure extends Figure {
    private static boolean[][] Oshape = {
            {true, true},
            {true, true}
    };

    public OFigure() {
        super(Oshape);
    }
}
