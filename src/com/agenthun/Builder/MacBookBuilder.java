package com.agenthun.Builder;

/**
 * Created by agenthun on 16/9/24.
 * 具体的Builder
 */
public class MacBookBuilder extends Builder {
    private ComputerProduct mProduct = new MacBook();

    @Override
    public void buildBoard(String board) {
        mProduct.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mProduct.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mProduct.setOS();
    }

    @Override
    public ComputerProduct create() {
        return mProduct;
    }
}
