package tdd.examples.mockito;

import java.util.LinkedList;

import static org.mockito.Mockito.*;


public class Examples03 {
    public static void main(String[] args) {
        LinkedList mockedList = mock(LinkedList.class);

        when(mockedList.get(anyInt())).thenReturn("int"); // 아무 인트형만 입력하면 문자열"int" 리턴
        when(mockedList.add(anyFloat())).thenReturn(true); // 아무 플롯형만 입력하면 true 리턴
        when(mockedList.add(anyString())).thenReturn(true); // 아무 문자열만 입력하면 true 리턴

        System.out.println(mockedList.get(999)); // "int"
        System.out.println(mockedList.add(3.3f)); // true
        System.out.println(mockedList.add("string")); // true

        verify(mockedList).get(anyInt()); // 인트형의 값을 넣었는지만 검사.
//        verify(mockedList).get(999); // 999 라는 값을 넣었는지 검사.
        verify(mockedList).add(eq( 3.3f ));
//        verify(mockedList).add(eq("string"));
        verify(mockedList).add("string");
    }
}

