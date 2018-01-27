package com.dfs.graph;

import java.util.HashMap;
import java.util.HashSet;


public class Graph {
    private HashMap<Integer, Node> graph = new HashMap<Integer, Node>();

    public Node getNode(int key){
        return graph.get(key);
    }

    public void addEdge(int source, int destination) {
        Node s = this.getNode(source);
        Node d = this.getNode(destination);
        s.addNeighbors(d);
    }

    public void addNode(int key){
        Node node = new Node(key);
        graph.put(key, node);
    }

    public boolean hasPath(int source, int destination){
        Node s = this.getNode(source);
        Node d = this.getNode(destination);
        HashSet<Node> visited = new HashSet<Node>();
        return this.hasPath(s, d, visited);
    }

    private boolean hasPath(Node source, Node destination, HashSet visited){

        //No children
        if(visited.contains(source)){
            return false;
        }

        visited.add(source);

        if(source.equals(destination)){
            return true;
        }

        for(Node child: source.getNeighbours()){
            if(this.hasPath(child, destination, visited)){
                return true;
            }
        }

        return false;
    }
}
