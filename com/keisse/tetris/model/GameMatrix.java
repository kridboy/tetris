package com.keisse.tetris.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.keisse.tetris.util.FormatUtil.EMPTY;

public class GameMatrix {
    private char[][] matrix = new char[10][16];
    private List<Block> nextBlocks = new ArrayList<>();
    private Block switchBlock;
    private Random x = new Random();
    private int activePosition = 4;
    private int activeDepth=0;

    public GameMatrix() {
        for (char[] e : matrix)
            Arrays.fill(e, EMPTY);

        for (Block e : nextBlocks) {
            e = newBlock();//TODO why does it act like this doesn't do stuff
        }
        dropNext();
    }

    public Block getSwitchBlock() {
        return switchBlock;
    }

    public void setActivePosition(int activePosition) {
        this.activePosition = activePosition;
    }

    public void setActiveDepth(int activeDepth) {
        this.activeDepth = activeDepth;
    }

    public int getActiveDepth() {
        return activeDepth;
    }

    public int getActivePosition() {
        return activePosition;
    }

    public void setSwitchBlock(Block switchBlock) {
        this.switchBlock = switchBlock;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public List<Block> getNextBlocks() {
        return nextBlocks;
    }

    public void setNextBlocks() {
        nextBlocks.remove(0);
        nextBlocks.add(newBlock());
    }

    private void dropNext() {
        Block next = getNextBlocks().get(0);
        setNextBlocks();

        if (next.isLine()) {
            for (int i = 0; i < next.shapeLength(); i++) {
                char[][] temp = getMatrix();
                //TODO THIS IS WHERE MAGIC NEEDS TO HAPPEN
                setMatrix(temp);
            }
        }
    }

    public void refresh() {
        try {
            Thread.sleep(150);
        } catch (Exception ex) {
        }

    }

    public boolean collision() {

        return false;
    }

    private Block newBlock() {
        switch (x.nextInt(5)) {
            case 1:
                return new LeftZBlock();
            case 2:
                return new LineBlock();
            case 3:
                return new RightCornerBlock();
            case 4:
                return new RightZBlock();
            case 5:
                return new ThreeBlock();
            default:
                return new LeftCornerBlock();
        }

    }

}
