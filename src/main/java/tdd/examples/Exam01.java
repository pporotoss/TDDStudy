package tdd.examples;

import java.lang.reflect.Method;

public class Exam01 {
    
    public static void main(String[] args) {
        try {
            // 클래스패쓰에서 해당하는 이름의 클래스를 찾아서 클래스 정보를 메모리에 올린다.
            // static 변수는 클래스를 로드할때 메모리에 한번만 올라가게 된다.
            Class clazz = Class.forName("tdd.examples.MyUtil");
            
//            System.out.println(MyDriver.getName());
            
            // 인스턴스 생성
            Object object = clazz.newInstance();
            
            Method[] declaredMethods = clazz.getDeclaredMethods();
    
            for (Method declaredMethod : declaredMethods) {
                System.out.println(declaredMethod.getName());
                Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                for (Class<?> parameterType : parameterTypes) {
                    System.out.println(parameterType.getName());
                }
    
                Class<?> returnType = declaredMethod.getReturnType();
                if(returnType != null) {
                    System.out.println("return type : "+returnType);
                }
                System.out.println("------------------------------------------------------");
            }
    
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyUtil {
    
    static {
//        MyDriver.setName("MyUtilDriver");
//        System.out.println("static block!!!!!!");
    }
    
    @MyTest
    public void print1() {
      System.out.println("print1() excute!!!");
    }
    
    @MyTest
    public String getName() {
        System.out.println("execute getName()");
        return "MyName is Kwon";
    }
    
    public void setName(String name) {
        System.out.println(name + "으로 설정 합니다.");
    }
}

class MyDriver {
    private static String name;
    
    public static String getName() {
        return name;
    }
    
    public static void setName(String name) {
        MyDriver.name = name;
    }
}