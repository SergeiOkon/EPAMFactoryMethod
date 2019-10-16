package com.tetris;

import com.tetris.service.FigureService;

public class Main {

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        FigureService figureService = new FigureService();
        figureService.showRandomFigures();
    }
}
