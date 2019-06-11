package com.keisse.tetris.model;

import static com.keisse.tetris.util.FormatUtil.BLOCK;

public class ThreeBlock extends Block {
    public void setBlock() {
        switch (orientation) {
            case 1:
                shape[1][0] = BLOCK;
                shape[1][0] = BLOCK;
                shape[1][1] = BLOCK;
                shape[1][2] = BLOCK;
                break;
            case 2:
                shape[1][0] = BLOCK;
                shape[0][1] = BLOCK;
                shape[1][1] = BLOCK;
                shape[2][1] = BLOCK;
                break;
            case 3:
                shape[1][2] = BLOCK;
                shape[0][1] = BLOCK;
                shape[1][1] = BLOCK;
                shape[2][1] = BLOCK;
                break;
            default:
                shape[1][2] = BLOCK;
                shape[1][0] = BLOCK;
                shape[1][1] = BLOCK;
                shape[1][2] = BLOCK;
                break;
        }
    }
}
