package com.dfs;

import com.dfs.graph.Graph;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);

        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(1,3);
        graph.addEdge(3,4);

        System.out.println(graph.hasPath(1,3));
        System.out.println(graph.hasPath(1,5));
    }
}
