package com.dfs.graph;
import java.util.LinkedList;


public class Node {
    private int key;

    private LinkedList<Node> neighbors = new LinkedList<Node>();

    Node(int key){
        this.key = key;
    }

    private int getKey(){
        return this.key;
    }

    public void addNeighbor(Node node){
        this.neighbors.add(node);
    }

    public LinkedList<Node> getNeighbours(){
        return this.neighbors;
    }
}
