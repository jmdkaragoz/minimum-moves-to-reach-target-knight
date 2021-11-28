package com.company;

public class Node {
    //X and Y will be the positions in the board
    int x;
    int y;
    int distance; //Distance will be the number moves that has been made as result
    Node(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Node{" +
                "x=" + x +
                ", y=" + y +
                ", distance=" + distance +
                '}';
    }
}
