package com.algo.graph.w3_241003.leetcode_332;

import java.util.*;

/**
 * 일정 재구성
 */
public class LeetCode332 {
    private static final String START = "JFK";

    public List<String> findItinerary(List<List<String>> tickets) {
        List<List<String>> allPaths = new ArrayList<>();
        LinkedList<String> path = new LinkedList<>();


        HashMap<String, LinkedList<Node>> graph = makeGraph(tickets);

        path.add(START);
        dfs(START, graph, path, allPaths, 0, tickets.size());
        // 가장 긴 경로를 찾아서 반환
        return allPaths.get(allPaths.size() - 1);
    }

    private boolean dfs(String from, HashMap<String, LinkedList<Node>> graph, LinkedList<String> path, List<List<String>> allPaths,
                        int currentSize,
                        int size) {
        LinkedList<Node> nodes = graph.get(from);
        if (nodes == null || currentSize == size) {
            allPaths.add(new ArrayList<>(path));
            return currentSize == size;
        }
        for (Node node : nodes) {
            if (!node.visited) {
                node.visited = true;
                path.add(node.name);
                if (dfs(node.name, graph, path, allPaths, currentSize + 1, size)) {
                    return true;
                } else {
                    path.removeLast();
                    node.visited = false;
                }
            }
        }
        return false;
    }

    private static HashMap<String, LinkedList<Node>> makeGraph(List<List<String>> tickets) {
        HashMap<String, LinkedList<Node>> graph = new HashMap<>();

        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            Node toNode = Node.of(ticket.get(1));
            Optional.ofNullable(graph.get(from))
                    .ifPresentOrElse(
                            nodes -> nodes.add(toNode),
                            () -> {
                                LinkedList<Node> list = new LinkedList<>();
                                list.add(toNode);
                                graph.put(from, list);
                            }
                    );
        }

        for (LinkedList<Node> nodes : graph.values())
            Collections.sort(nodes);

        return graph;
    }


    static class Node implements Comparable<Node> {
        String name;
        boolean visited;

        public Node(String name) {
            this.name = name;
        }

        public static Node of(String name) {
            return new Node(name);
        }

        @Override
        public int compareTo(Node o) {
            return this.name.compareTo(o.name);
        }
    }
}