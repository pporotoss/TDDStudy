package tdd.examples;

public class Exam05 {
    
    public static void main(String[] args) {
        new MyChildBean().run();
        
        new MyBean() {
            @Override
            public void run() {
                System.out.println("run2222222222222");
            }
        }.run();
    }
    
}

abstract class MyBean {
    public abstract void run();
}

class MyChildBean extends MyBean {
    
    @Override
    public void run() {
        System.out.println("run!!!!");
    }
    
}


