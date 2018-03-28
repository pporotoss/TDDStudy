package tdd.examples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FirstTest {
    // 테스트 대상은 보통 필드로 선언한다.
    private MyUtil myUtil;
    
    
    @Before
    public void init() {
        myUtil = new MyUtil();
        System.out.println("init");
    }
    
    @Test
    public void test1() throws Exception {
        System.out.println("test1");
    }
    
    @Test
    public void test2() throws Exception {
        System.out.println("test2");
    }
    
    @Test
    public void test3() throws Exception {
        System.out.println("test3");
    }
    
    @After
    public void destroy() {
        System.out.println("destroy");
    }
    
}
