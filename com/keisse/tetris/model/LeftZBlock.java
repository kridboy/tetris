package com.keisse.tetris.model;

import static com.keisse.tetris.util.FormatUtil.BLOCK;

public class LeftZBlock extends Block {
    public LeftZBlock(){
        setBlock();
    }
    public void setBlock() {
        switch (orientation) {
            case 3:
            case 1:
                shape[0][2] = BLOCK;
                shape[1][0] = BLOCK;
                shape[1][1] = BLOCK;
                shape[2][0] = BLOCK;
                break;
            case 2:
            default:
                shape[0][1] = BLOCK;
                shape[0][2] = BLOCK;
                shape[1][0] = BLOCK;
                shape[1][1] = BLOCK;

                break;
        }
    }
}
