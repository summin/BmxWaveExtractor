/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package BmxWavExtractor;

import java.io.FileInputStream;


public class App {


    public String getGreeting() {
        FileInputStream in = null;
        FileOutputStream out = null;
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
