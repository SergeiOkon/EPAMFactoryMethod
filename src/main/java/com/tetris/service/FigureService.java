package com.tetris.service;

import com.tetris.entities.Figure;
import com.tetris.factory.FigureFactory;
import com.tetris.factory.impl.IFigureFactory;
import com.tetris.factory.impl.LFigureFactory;
import com.tetris.factory.impl.OFigureFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FigureService {
    private static List<FigureFactory> factories;
    private static Random random;


    public void showRandomFigures() {
        getRandomFigures().forEach(System.out::println);
    }

    private List<Figure> getRandomFigures() {
        List<Figure> figures = new ArrayList<>();
        factories = Arrays.asList(new IFigureFactory(), new LFigureFactory(), new OFigureFactory());
        random = new Random();
        FigureFactory creatorFigure = getRandomCreatorFigure();
        for (int i = 0; i < 15; ++i) {
            figures.add(creatorFigure.createFigure());
            creatorFigure = getRandomCreatorFigure();
        }
        return figures;
    }

    private static FigureFactory getRandomCreatorFigure() {
        return factories.get(random.nextInt(factories.size()));
    }
}
