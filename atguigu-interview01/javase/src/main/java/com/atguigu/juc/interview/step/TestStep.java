package com.atguigu.juc.interview.step;

import org.junit.Test;

/**
 * 编程题: 有n步台阶, 一次只能上1步或2步, 共有多少种走法？
 *
 * @author miaoqi
 * @date 2023-05-13 15:58:28
 */
public class TestStep {

    @Test
    public void test() {
        long start = System.currentTimeMillis();
        System.out.println(f(100));//165580141
        long end = System.currentTimeMillis();
        System.out.println(end - start);//586ms
    }

    //实现f(n): 求n步台阶, 一共有几种走法
    public int f(int n) {
        if (n < 1) {
            throw new IllegalArgumentException(n + "不能小于1");
        }
        if (n == 1 || n == 2) {
            return n;
        }
        return f(n - 2) + f(n - 1);
    }

}