package org.example.Head04_BigO.example04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ListWriteExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        userList.add((new User("kim", 22)));
        userList.add(new User("yun", 23));
        userList.add(new User("lee", 33));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.ser"))) {
            oos.writeObject(userList); // 리스트 자체를 직렬화
            System.out.println("리스트 직렬화 완료: users.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
