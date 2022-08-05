package ru.itsjava.iostreams;

import java.io.*;

public class UserPractice {
    public static void main(String[] args) {
        User user = new User("Pavel", "X2585bP");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/main/resources/user.txt"))) {
            objectOutputStream.writeObject(user);
        }catch (IOException exception) {
            exception.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/main/resources/user.out"))) {
            User uploadedUser = (User) objectInputStream.readObject();
            System.out.println(uploadedUser.getLogin());
            System.out.println(uploadedUser.getPassword());
        }catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }



    }
}
