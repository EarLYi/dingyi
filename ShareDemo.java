package tread;

/*�߳���Դ���� 
* ������ݹ������⣬����ʹ��ͬ������νͬ������ָ���߳���ͬһʱ����ֻ����һ���߳�ִ���ƶ����� 
* ͬ��������    1.ͬ�������     synchronized(Ҫͬ���Ķ���[��㶨��Ķ��󣬱��ͬ���߳�]){ 
*                                 Ҫͬ�������                            
*                              } 
*                 2.ͬ������    public synchronized void method(){ 
*                                 Ҫͬ���Ĳ��� 
*                             } 
* ͬ���������⣺ͬ������ή�����ܣ�����������̰߳�ȫ 
* 
* ʹ��ͬ��������Ҫ��ѭ�Ļ���ԭ�� 
*         1.�Ǵ�����ࡣ�Ѳ����̱߳仯��Ԥ����ͺ����Ƴ�synchronized�� 
*         2.��Ҫ��������InputStream.read() 
*         3.�ڵ�ǰ�������ʱ����Ҫ���׵ĵ������������������������ 
* */

public class ShareDemo { 
    public static void main(String[] args) { 
        ShareThreadOne demo = new ShareThreadOne(); 
        Thread one = new Thread(demo,"С��"); 
        Thread two = new Thread(demo,"С��"); 
        one.start(); 
        two.start(); 
    } 
}


class ShareThreadOne implements Runnable{ 
    Object obj = new Object();//ͬ����Ƕ��� 
    public void run() { 
        //ͬ������� 
        /*synchronized (obj) { //�����̶߳��󣬴�ʱ����OΪ0 
            System.out.println(Thread.currentThread().getName()+"��������ʺ"); 
            try { 
                Thread.sleep(1000); 
            } catch (InterruptedException e) { 
                // TODO Auto-generated catch block 
                e.printStackTrace(); 
            } 
            System.out.println(Thread.currentThread().getName()+"������"); 
        }*/ 
        
        doMethod(); 
    } 
    
    
    //ͬ������ 
    public synchronized void doMethod(){ 
        System.out.println(Thread.currentThread().getName()+"��������ʺ"); 
        try { 
            Thread.sleep(1000); 
        } catch (InterruptedException e) { 
            // TODO Auto-generated catch block 
            e.printStackTrace(); 
        } 
        System.out.println(Thread.currentThread().getName()+"������"); 
    } 
}

