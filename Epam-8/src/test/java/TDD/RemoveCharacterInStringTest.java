package TDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoveCharacterInStringTest {

	@Test
	public void test1() {
		RemoveCharacterInString rc=new RemoveCharacterInString();
		assertEquals("BCD",rc.removeString("ABCD"));
	}
	@Test
	public void test2() {
		RemoveCharacterInString rc=new RemoveCharacterInString();
		assertEquals("CD",rc.removeString("AACD"));
	}
	@Test
	public void test3() {
		RemoveCharacterInString rc=new RemoveCharacterInString();;
		assertEquals("BCD",rc.removeString("BACD"));
	}
	@Test
	public void test4() {
		RemoveCharacterInString rc=new RemoveCharacterInString();
		assertEquals("BBAA",rc.removeString("BBAA"));
	}
	@Test
	public void test5() {
		RemoveCharacterInString rc=new RemoveCharacterInString();
		assertEquals("BAA",rc.removeString("AABAA"));
	}
	@Test
	public void test6() {
		RemoveCharacterInString rc=new RemoveCharacterInString();
		assertEquals("AAA",rc.removeString("AAAAA"));
	}

}