package C18Thread;

import com.fasterxml.jackson.core.JsonParseException;

public class RunnableImplementsClass implements  Runnable{

    @Override
    public void run() {
        System.out.println("RunnableImplementsClass : " + Thread.currentThread().getName());
    }
}
