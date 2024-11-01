package com.devbaktiyarov.immutable;

public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ImmutablePoint move(int deltaX, int deltaY) {
        return new ImmutablePoint(this.x + deltaX, this.y + deltaY);
    }

    // public ImmutablePoint move2(String x, String y) {
    //     return new ImmutablePoint(x, y);
    // }
}

