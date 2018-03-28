package tdd.examples;

import java.lang.reflect.Method;

/**
 * getMethod vs getDeclaredMethod
 *
 *  - getMathod : public 으로 선언된 메서드만 반환.
 *  - getDeclaredMethod : 클래스에 선언된 모든 메서드를 반환
 */
public class Exam03 {
    
    
    public static void main(String[] args) throws Exception {
        String className = "tdd.examples.MyUtil";
        String methodName = "setName";
        Object[] parameterValues = {"Kim"};
        
        Class<?> clazz = Class.forName(className);
    
//        for (Method method : clazz.getMethods()) {
//            if(methodName.equals(method.getName())) {
//                method.invoke(clazz.newInstance(), parameterValues);
//            }
//        }
        
        Method method = clazz.getMethod(methodName, String.class);

        Object instance = clazz.newInstance();

        method.invoke(instance, parameterValues);
    }

}
