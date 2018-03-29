package tdd.examples.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;


public class Examples07 {
    @Mock private List mockedList;

    @Before
    public void initMocks() {
        
        // @Mock 어노테이션이 붙어있는 모든 필드에 대하여 목객체를 생성.
        MockitoAnnotations.initMocks(this); // mock all the field having @Mock annotation
    }

    @Test
    public void test() {
        // test here
        mockedList.add("one");
        
        // verification
        verify(mockedList).add("one");
    }
}
