package creational;

import java.util.concurrent.locks.ReentrantLock;

public class Singleton {
    private String val;

    private static final ReentrantLock reentrant = new ReentrantLock();
    private Singleton(){
    }

   private static Singleton instance;

    public static Singleton getInstance(){
       try {
           reentrant.lock();
           if (instance == null){
               instance = new Singleton();
           }
       }finally {
           reentrant.unlock();
       }
       return instance;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
