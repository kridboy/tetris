package com.keisse.tetris.model;

import static com.keisse.tetris.util.FormatUtil.BLOCK;

public class LineBlock extends Block {

    public LineBlock() {
        shape = new char[4][4];
        setBlock();
    }

    private void setBlock() {
        switch (orientation) {
            case 3:
            case 1:
                shape[1][0] = BLOCK;
                shape[1][1] = BLOCK;
                shape[1][2] = BLOCK;
                shape[1][4] = BLOCK;
                break;
            case 2:
            default:
                shape[0][1] = BLOCK;
                shape[1][1] = BLOCK;
                shape[2][1] = BLOCK;
                shape[4][1] = BLOCK;
                break;
        }
    }

}
