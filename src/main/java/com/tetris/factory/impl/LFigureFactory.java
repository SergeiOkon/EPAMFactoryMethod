package com.tetris.factory.impl;

import com.tetris.entities.Figure;
import com.tetris.entities.figures.IFigure;
import com.tetris.entities.figures.LFigure;
import com.tetris.entities.figures.OFigure;
import com.tetris.factory.FigureFactory;

public class LFigureFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new LFigure();
    }
}
