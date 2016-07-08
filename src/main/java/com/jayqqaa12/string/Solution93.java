package com.jayqqaa12.string;

import java.util.ArrayList;
import java.util.List;


/**
 * 从给定的 字符串中 解析出可能的 ip地址
 * <p>
 * <p>
 * 难度 3星
 */
public class Solution93 {

    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();

        dfs(s,list,0,"",0);

        return list;
    }

    private void dfs(String ip, List<String> list,int index,String restroed,int c) {

        if(c>4)return;
        if(c==4&&ip.length()==index)list.add(restroed);


        for (int i = 1; i <4; i++) {
            if(index+i>ip.length())break;
            String s = ip.substring(index,index+i);
            //去掉非法的
            if((s.startsWith("0")&&s.length()>1)||(i==3&&Integer.parseInt(s)>255))continue;

            dfs(ip,list,index+i,restroed+s+(c==3?"":"."),c+1);
        }

    }

}