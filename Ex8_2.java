package ex8_2;
/**
 * ����4���̣߳������߳�ִ�б�����һ����������ִ�б�����һ
 * @author ����
 * @date 2020��11��17��
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
         System.out.println(Thread.currentThread().getName()+" ִ���˼�1����  Ŀǰi��ֵΪ��"+i);
	}

}
class MinusThread implements Runnable {
	int i;

	public MinusThread(int i) {
		this.i =i;
	}

	public void run() {
         i--;
         System.out.println(Thread.currentThread().getName()+" ִ���˼�1����  Ŀǰi��ֵΪ��"+i);
	}

}
