package com.jayqqaa12;

import java.util.ArrayList;

class DirectedGraphNode {
         int label;
        ArrayList<DirectedGraphNode> neighbors;
         DirectedGraphNode(int x) { label = x; neighbors = new ArrayList<DirectedGraphNode>(); }
     };