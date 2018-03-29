package tdd.examples.mockito;

import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

// Mocking과 Verification
public class Examples01 {
    public static void main(String[] args){
        // mock
        List mockedList = mock(List.class);

        // mock 사용하기
        mockedList.add("one");
        mockedList.add("two");
        mockedList.clear();

        // verification -- 메서드를 호출했는지여부를 검사한다.
        // 만약, 메서드에 파라미터를 입력했다면, 동일한 매개변수 값을 넘겨줬는지 여부를 검사한다.
        
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }
}
