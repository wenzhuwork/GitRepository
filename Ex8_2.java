package ex8_2;
/**
 * 创建4个线程，两个线程执行变量加一，另外两个执行变量减一
 * @author 张仁
 * @date 2020年11月17日
 */
public class Ex8_2 {
	public static void main(String[] args) {
       int i = 100;
       new Thread(new AddThread(i)).start();
       new Thread(new MinusThread(i)).start();
       new Thread(new AddThread(i)).start();
       new Thread(new MinusThread(i)).start();
	}
}

class AddThread implements Runnable {
	int i;

	public AddThread(int i) {
		this.i =i;
	}

	public void run() {
         i++;
         System.out.println(Thread.currentThread().getName()+" 执行了加1操作  目前i的值为："+i);
	}

}
class MinusThread implements Runnable {
	int i;

	public MinusThread(int i) {
		this.i =i;
	}

	public void run() {
         i--;
         System.out.println(Thread.currentThread().getName()+" 执行了减1操作  目前i的值为："+i);
	}

}
