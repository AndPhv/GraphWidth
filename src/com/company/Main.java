package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        print(graph);
    }
    public static void print(Graph graph) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        System.out.print("Введите количество вершин в графе - ");
        graph.amountV = scanner.nextInt();

        for (int i = 0; i < graph.amountV; i++) {
            System.out.print("Введите вершину - " );
            graph.addVertex(scanner.next());
            System.out.println("Номер вершины равен " + i);
        }

        for (int i = 0; i < graph.amountV - 1; i++) {
            System.out.print("Соединить вершину ");
            x = scanner.nextInt();
            System.out.print(" с вершиной ");
            y = scanner.nextInt();
            graph.addEdge(x, y, 1);
        }
        graph.passInWidth(0);
    }
}
