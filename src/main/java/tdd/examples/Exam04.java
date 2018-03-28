package tdd.examples;

import java.lang.reflect.Method;

public class Exam04 {
    
    public static void main(String[] args) throws Exception {
        String className = "tdd.examples.MyUtil";
        
        Class clazz = Class.forName(className);
    
        Object newInstance = clazz.newInstance();
        
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            MyTest annotation = method.getAnnotation(MyTest.class);
            if(annotation != null) {
//                System.out.println(method.getName());
                method.invoke(newInstance);
            }
        }
        
        
    }
}
