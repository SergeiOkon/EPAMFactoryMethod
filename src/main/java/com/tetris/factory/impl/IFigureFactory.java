package com.tetris.factory.impl;

import com.tetris.entities.Figure;
import com.tetris.entities.figures.IFigure;
import com.tetris.factory.FigureFactory;

public class IFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new IFigure();
    }
}
