package com.th.springtest;

/**
 * @ClassName: DoWhileTest
 * @Description:
 * @Author: 唐欢
 * @Date: 2022/7/25 10:54
 * @Version 1.0
 */
public class DoWhileTest {
	public static void main(String[] args) {
		for (int i=2;i<=10;i++) {
			do {

				System.out.println("i="+i);
				System.out.println("先执行执行do");
			} while (i < 3);
			System.out.println("跳出do循环");
		}
	}
}