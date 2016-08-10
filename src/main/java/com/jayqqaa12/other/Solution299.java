package com.jayqqaa12.other;


/**
 * 假设你正在玩猜数字游戏（Bulls and Cows）：你写出4个数字让你的朋友猜，每次你的朋友猜一个数字，
 * 你给出一条线索，这个线索告诉你的朋友，有多少个数字位置是正确的（被称为Bulls），
 * 有多少个数字位置是不正确的（被称为Cows），你的朋友需要根据这些线索最终猜出正确的数字。
 *
 * 例如，给出的数字是1807，你的朋友猜的是7810，这里用A代表Bulls，B代表Cows，则给出的线索是1A3B。
 * 题目中给出的secret（被猜测数字）和guess（猜测的数字）长度一定是一样的。
 *
 * 难度1.5星
 */
public class Solution299 {

    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i<secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                if (numbers[secret.charAt(i)-'0']++ < 0) cows++;
                if (numbers[guess.charAt(i)-'0']-- > 0) cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}