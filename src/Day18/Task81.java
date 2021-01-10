package Day18;

import java.io.IOException;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class Task81 {
    public static void main(String[] args) {

    }

    public static class PrintStackTraceDemo {
        public static void x() {
            try {
                a();
            } catch (IOException ioe) {//this way of stack trace output is workaround for moodle
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream ps = new PrintStream(byteArrayOutputStream);
                ioe.printStackTrace(ps);
                System.out.println(byteArrayOutputStream);
            }
        }

        public static void t() throws IOException {
            throw new IOException();
        }

        static void a() throws IOException {
            m();
        }

        static void m() throws IOException {
            t();
        }
    }
}
