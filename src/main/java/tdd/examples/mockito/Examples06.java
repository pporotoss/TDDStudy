package tdd.examples.mockito;

import org.mockito.InOrder;

import java.util.List;
import static org.mockito.Mockito.*;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;

// Verification in order
public class Examples06 {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1(){
        // single mock
        List singleMock = mock(List.class);

        singleMock.add("first");
        singleMock.add("second");

        InOrder inOrder = inOrder(singleMock); // 메서드 호출 여부 뿐만 아니라, 호출 순서까지 확인하고 싶을때 사용.
    
        inOrder.verify(singleMock).add("first");
        inOrder.verify(singleMock).add("second");
    }

    public static void test2(){
        // multiple mocks
        List firstMock = mock(List.class);
        List secondMock = mock(List.class);
        //using mocks
        firstMock.add("first");
        firstMock.add("second");
        secondMock.add("second");
        
        // 여러 객체의 메서드의 호출 순서를 확인하고 싶을때.
        InOrder inOrder = inOrder(firstMock, secondMock); // pass multiple mocks to verify

        inOrder.verify(firstMock).add("first");
        inOrder.verify(secondMock).add("second");
    }
}

