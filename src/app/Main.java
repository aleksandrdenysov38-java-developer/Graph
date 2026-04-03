package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();


        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);


        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("Граф после добавления:");
        graph.printGraph();


        System.out.println("\nСуществует ли вершина 2? " + graph.hasVertex(2));
        System.out.println("Существует ли ребро 1-2? " + graph.hasEdge(1, 2));


        graph.removeEdge(1, 2);
        System.out.println("\nПосле удаления ребра 1-2:");
        graph.printGraph();


        graph.removeVertex(3);
        System.out.println("\nПосле удаления вершины 3:");
        graph.printGraph();


        System.out.println("\nСуществует ли вершина 3? " + graph.hasVertex(3));
        System.out.println("Существует ли ребро 2-3? " + graph.hasEdge(2, 3));
    }
}
