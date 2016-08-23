package com.jayqqaa12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


/**
 * 给定一个有向图，图节点的拓扑排序被定义为：
 * 对于每条有向边A--> B，则A必须排在B之前
 * 拓扑排序的第一个节点可以是任何在图中没有其他节点指向它的节点
 * 找到给定图的任一拓扑排序
 */
public class TopologicalSorting {


    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        ArrayList<DirectedGraphNode> rst = new ArrayList<>();
        if (graph == null || graph.size() == 0) {
            return graph;
        }
        //Keep track of all neighbors in HashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (DirectedGraphNode node : graph) {
            for (DirectedGraphNode neighbor : node.neighbors) {
                int keyN = neighbor.label;
                if (map.containsKey(keyN)) {
                    map.put(keyN, map.get(keyN) + 1);
                } else {
                    map.put(keyN, 1);
                }
            }
        }
        //BFS: Add root node. Note: 
        Queue<DirectedGraphNode> queue = new LinkedList<>();
        for (DirectedGraphNode node : graph) {
            if (!map.containsKey(node.label)) {
                queue.offer(node);
                rst.add(node);
            }
        }
        //BFS: go through all children
        while (!queue.isEmpty()) {
            DirectedGraphNode node = queue.poll();
            for (DirectedGraphNode n : node.neighbors) {
                int label = n.label;
                map.put(label, map.get(label) - 1);
                if (map.get(label) == 0) {
                    rst.add(n);
                    queue.offer(n);
                }
            }
        }
        return rst;
    }
}