package com.keisse.tetris.model;

import java.util.Arrays;

import static com.keisse.tetris.util.FormatUtil.EMPTY;

public abstract class Block {
    public char[][] shape = new char[3][3];
    short orientation;

    public Block() {
        for (char[] e : shape)
            Arrays.fill(e, EMPTY);
    }

    public short getOrientation() {
        return orientation;
    }

    public void setOrientation(short orientation) {
        this.orientation = orientation;
    }

    public void setOrientation() {
        this.orientation++;
    }

    public void rotate() {
        if (getOrientation() == 4) setOrientation((short) 0);
        else setOrientation();

    }

    public char[] getShape(int row) {
        if (isLine())
            return new char[]{shape[row][0], shape[row][1], shape[row][2], shape[row][3]};
        else
            return new char[]{shape[row][0], shape[row][1], shape[row][2]};

    }

    public int shapeLength() {
        return getShape(0).length;
    }

    public boolean isLine(){
        if(shapeLength()==4) return true;
        else return false;
    }

}
