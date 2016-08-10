package com.jayqqaa12.other;


/**
 * 在环形路线上一共有N个加油站，每个加油站的存储容量为gas[i].你有一辆汽油无限存储的汽车，如果你从加油站i到下一站（i+1），你需要
 * 消耗汽油cost[i]  你从某一个加油站开始你的旅程，但是你的汽车里没有任何的汽油。
 * 如果你能沿着环形路线旅游一遍，返回你开始旅游的加油站的下标否则返回-1
 *
 *
 * 难度3星
 *
 */
public class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int tank = 0;
        for(int i = 0; i < gas.length; i++)
            tank += gas[i] - cost[i];
        if(tank < 0)   //和小于0 不可能满足条件
            return - 1;

        int start = 0;
        int accumulate = 0;
        for(int i = 0; i < gas.length; i++){
            int curGain = gas[i] - cost[i];
            if(accumulate + curGain < 0){
                start = i + 1;
                accumulate = 0;
            }
            else accumulate += curGain;
        }

        return start;
    }
}