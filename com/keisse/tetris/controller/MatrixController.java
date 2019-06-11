package com.keisse.tetris.controller;

import com.keisse.tetris.model.GameMatrix;

public class MatrixController {
    GameMatrix game = new GameMatrix();
    void go(){
        game.refresh();
    }
}
