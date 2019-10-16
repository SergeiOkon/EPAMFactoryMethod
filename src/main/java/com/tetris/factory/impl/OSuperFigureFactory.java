package com.tetris.factory.impl;

import com.tetris.entities.Figure;
import com.tetris.entities.figures.OFigure;
import com.tetris.entities.figures.OSuperFigure;
import com.tetris.factory.FigureFactory;

public class OSuperFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new OSuperFigure();
    }
}
