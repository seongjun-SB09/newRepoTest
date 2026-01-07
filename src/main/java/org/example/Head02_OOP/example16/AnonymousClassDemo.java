package org.example.Head02_OOP.example16;

public class AnonymousClassDemo {
    public static void main(String[] args) {
        AbstractTask abstractTask = new AbstractTask() {
            @Override
            public void execute() {
                System.out.println("추상 클래스의 execute() 구현부");
            }

            public void start() {
                System.out.println("Task 시작 변경");
            }
        };

        abstractTask.start();
        abstractTask.execute();
    }
}
