package com.abc.Include;

import org.testng.annotations.Test;

public class Groups {
@Test(groups="inbox")
public void test() {
	System.out.println("DON");
}
@Test(groups="compose")
public void test1() {
	System.out.println("Bosco");
}
@Test(groups="compose")
public void test2() {
	System.out.println("PanMasala");
}
@Test(groups="inbox")
public void test3() {
	System.out.println("Jaffa");
}
}
