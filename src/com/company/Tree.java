package com.company;

import java.util.*;

public class Tree {

    //BFS
    int minimum_steps(int board_height, int board_width, int knight_start_x_position, int knight_start_y_position, int knight_end_x_position, int knight_end_y_position) {
        Queue<Node> queue = new LinkedList<>(); //Contains nodes that has been checked and are within the board
        //Inserting the valid moves the knight can make separated in two int arrays
        int[] validMovesX = {1, -1, 1, -1, 2, -2, 2, -2};
        int[] validMovesY = {2, 2, -2, -2, 1, 1, -1, -1};

        queue.add(new Node(knight_start_x_position, knight_start_y_position, 0)); //Creating the start position which is the root in the tree and giving it a distance of 0
        Node currentNode = queue.peek(); // The start position will be the root in the tree

        // A temporary x and y will be used to check the possible moves
        int tempX;
        int tempY;
        Set<String> visited = new HashSet<>(); //Creating a HashSet to insert all points that has been visited, so it won't be visited it again. Duplication will be handled by the HashSet.
        visited.add(currentNode.x + "," + currentNode.y); //The root node will be added as visited since it is the starting point
        while(!queue.isEmpty()) {
            //Checking if the current node equals the end position. If so the result will be returned
            if(currentNode.x == knight_end_x_position && currentNode.y == knight_end_y_position) {
                return currentNode.distance;
            }
            currentNode = queue.poll(); //Assigning the currentnode with the next node in the tree and remove it afterwards
            //Looping through all the valid moves
            for(int i = 0; i < validMovesX.length; i++) {
                //Assigning tempX and tempY with the next possible move
                tempX = currentNode.x + validMovesX[i];
                tempY = currentNode.y + validMovesY[i];
                //Checking if the current position is inside the board and has not been visited yet
                if(tempX >= 0 && tempX <= board_width && tempY >= 0 && tempY <= board_height && !(visited.contains(tempX + "," + tempY))) {
                    queue.add(new Node(tempX, tempY, currentNode.distance+1)); //If so, the new node will be added to the tree
                    visited.add(tempX + "," + tempY); //Adding the position as visited
                }
            }
        }
        //In case no result has been found, -1 will be returned
        return -1;
    }

}
