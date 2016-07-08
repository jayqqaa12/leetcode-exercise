package com.jayqqaa12.statck;


import java.util.*;

/**
 * 简化路径
 * <p>
 * For example,
 * path = "/home/", => "/home"
 * path = "/a/./b/../../c/", => "/c"
 *
 * 难度2星
 *
 */
public class Solution71 {

    public String simplifyPath(String path) {

        Deque<String > statck = new LinkedList<>();
        Set<String>  set = new HashSet<>(Arrays.asList(".","..",""));

        for (String  str:path.split("/")){

            if(str.equals("..")&&!statck.isEmpty()) statck.pop();
            else if(!set.contains(str)) statck.push(str);

        }
        String rst="";

        for (String str:statck) rst+="/"+ str;

        return  rst.isEmpty()?"/":rst;
    }
}