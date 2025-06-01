/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistent2;

/**
 *
 * @author dutaa
 */
import java.io.*;

public class ReadSerializePerson {
    public static void main(String[] args) {
        Person person = null;

        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            person = (Person) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Serialized person name = " + person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
