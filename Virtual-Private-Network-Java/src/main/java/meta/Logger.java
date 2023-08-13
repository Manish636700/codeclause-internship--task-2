/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meta;

public class Logger {
    private static final boolean ENABLE_LOGGING = true;
    public static void log(String message) {
        if (ENABLE_LOGGING) {
            System.out.println(message);
        }
    }
}
