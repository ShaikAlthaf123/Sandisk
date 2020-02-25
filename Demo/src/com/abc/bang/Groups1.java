package com.abc.bang;

import org.testng.annotations.Test;

public class Groups1 {
	@Test(groups="compose")
	public void test() {
		System.out.println("Srk");
	}

	@Test(groups="inbox")
	public void test1() {
		System.out.println("Sallu");
	}
	@Test(groups="compose")
	public void test2() {
		System.out.println("Ameer");
	}
	@Test(groups="inbox")
	public void test3() {
		System.out.println("Ranveer");
	}

}
