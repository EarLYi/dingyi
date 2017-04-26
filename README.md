# dingyi
java毕生笔记
package tread;

/*
* 解决数据共享问题，必须使用同步，所谓同步就是指多线程在同一时间内只能有一个线程执行制定代码 
* 同步方法：    1.同步代码块     synchronized(要同步的对象[随便定义的对象，标记同步线程]){ 
*                                 要同步代码块                            
*                              } 
*                 2.同步方法    public synchronized void method(){ 
*                                 要同步的操作 
*                             } 
* 同步方法问题：同步代码会降低性能，但是提高了线程安全 
* 
* 使用同步方法需要遵循的基本原则： 
*         1.是代码块简洁。把不随线程变化的预处理和后处理移出synchronized块 
*         2.不要阻塞。如InputStream.read() 
*         3.在当前代码加锁时，不要轻易的调用其它方法，可能造成死锁 
* */

public class ShareDemo { 
    public static void main(String[] args) { 
        ShareThreadOne demo = new ShareThreadOne(); 
        Thread one = new Thread(demo,"小白"); 
        Thread two = new Thread(demo,"小风"); 
        one.start(); 
        two.start(); 
    } 
}


class ShareThreadOne implements Runnable{ 
    Object obj = new Object();//同步标记对象 
    public void run() { 
        //同步代码块 
        /*synchronized (obj) { //锁死线程对象，此时对象O为0 
            System.out.println(Thread.currentThread().getName()+"，正在拉屎"); 
            try { 
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                // TODO Auto-generated catch block 
                e.printStackTrace(); 
            } 
            System.out.println(Thread.currentThread().getName()+"拉完了"); 
        }*/ 
        
        doMethod(); 
    } 
    
    
    //同步方法 
    public synchronized void doMethod(){ 
        System.out.println(Thread.currentThread().getName()+"，正在拉屎"); 
        try { 
            Thread.sleep(1000); 
        } catch (InterruptedException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
        System.out.println(Thread.currentThread().getName()+"拉完了"); 
    } 
}

