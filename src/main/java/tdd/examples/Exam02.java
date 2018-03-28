package tdd.examples;

import java.lang.reflect.Method;

public class Exam02 {
    
    public static void main(String[] args) throws Exception {
        String className = "tdd.examples.MyUtil";
//        String methodName = "print1";
        String methodName = "getName";
    
        Class<?> clazz = Class.forName(className);
        
        Method method = clazz.getMethod(methodName);
    
        Object returnValue = method.invoke(clazz.newInstance());
        if(returnValue != null) {
            System.out.println("return value : "+returnValue.getClass().getName());
        }
    }
    
}
