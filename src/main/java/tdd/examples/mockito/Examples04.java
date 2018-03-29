package tdd.examples.mockito;

import java.util.LinkedList;

import static org.mockito.Mockito.*;


public class Examples04 {
    public static void main(String[] args) {
        LinkedList mockedList = mock(LinkedList.class);

        mockedList.add("once");

        mockedList.add("twice");
        mockedList.add("twice");

//        mockedList.add("five times");
//        mockedList.add("five times");

        mockedList.add("three times");
        mockedList.add("three times");
        mockedList.add("three times");
//        mockedList.add("three times");
//        mockedList.add("three times");

        verify(mockedList).add("once"); // times(1) 기본값
        verify(mockedList, times(1)).add("once"); // 한번만 호출

        verify(mockedList, times(2)).add("twice"); // 두번만 호출.
        verify(mockedList, times(3)).add("three times"); // 세번만 호출

        verify(mockedList, never()).add("never happened"); // 호출된 적 없음

        verify(mockedList, atLeastOnce()).add("three times"); // 최소 한 번
        verify(mockedList, atLeast(2)).add("five times"); // 최소 두 번
        verify(mockedList, atMost(5)).add("three times"); // 최대 다섯 번
    }
}

