package com.tetris.entities.figures;

import com.tetris.entities.Figure;

public class IFigure extends Figure {

    private static boolean[][] Ishape = {
            {true},
            {true},
            {true}
    };

    public IFigure() {
        super(Ishape);
    }
}
