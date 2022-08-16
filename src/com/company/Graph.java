package com.company;

public class Graph {
    public int amountV = 10;
    private int[][] matrix;
    Vertex[] vertexList;
    private int currentV;
    private GraphQueue queue = new GraphQueue();


    public Graph() {
        vertexList = new Vertex[amountV];
        matrix = new int[amountV][amountV];
        currentV = 0;
    }

    public void addVertex(String name) {
        vertexList[currentV++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int value) {
        matrix[start][end] = 1;
        matrix[end][start] = value;
    }

    public int check(int v) {
        for (int i = 0; i < currentV; i++) {
            if (matrix[v][i] == 1 && vertexList[i].isVisited == false)
                return i;
        }
        return -1;
    }

    public void passInWidth(int index) {
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited = true;
        queue.add(index);

        int vertex;

        while (!queue.isEmpty()) {
            int temp = queue.remove();

            while ((vertex = check(temp)) != -1) {
                System.out.println(vertexList[vertex].name);
                vertexList[vertex].isVisited = true;
                queue.add(vertex);
            }
        }
        for (int i = 0; i < currentV; i++) {
            vertexList[i].isVisited = false;
        }
    }
}
