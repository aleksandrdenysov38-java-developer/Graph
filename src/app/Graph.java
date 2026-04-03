package app;

import java.util.*;

class Graph {
    private Map<Integer, Set<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }


    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new HashSet<>());
    }


    public void addEdge(int source, int destination) {
        if (!adjList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjList.containsKey(destination)) {
            addVertex(destination);
        }
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }


    public void removeVertex(int vertex) {
        if (!adjList.containsKey(vertex)) return;


        for (int neighbor : adjList.get(vertex)) {
            adjList.get(neighbor).remove(vertex);
        }

        adjList.remove(vertex);
    }


    public void removeEdge(int source, int destination) {
        if (adjList.containsKey(source)) {
            adjList.get(source).remove(destination);
        }
        if (adjList.containsKey(destination)) {
            adjList.get(destination).remove(source);
        }
    }


    public boolean hasVertex(int vertex) {
        return adjList.containsKey(vertex);
    }


    public boolean hasEdge(int source, int destination) {
        return adjList.containsKey(source) &&
                adjList.get(source).contains(destination);
    }


    public void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }
}
