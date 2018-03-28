package tdd.examples;

import java.lang.annotation.*;


@Target(ElementType.METHOD) // 정의한 어노테이션 붙일 수 있는 곳
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyTest { // 어노테이션 정의
}
