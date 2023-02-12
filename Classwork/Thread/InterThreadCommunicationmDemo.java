package Thread;

class Acc
{
	int accBalance=10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Stating Withdraw");
		if(this.accBalance<amount)
		{
			System.out.println("Less amount: waiting for deposite");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.accBalance=accBalance-amount;
		System.out.println(amount+" is Withdrawn successfully ");
	}
	synchronized void deposite(int amount)
	{
		System.out.println("Starting deposite");
		this.accBalance=accBalance+amount;
		System.out.println(amount+" is deposite ceomplete");
		notify();
	}
	}
public class InterThreadCommunicationmDemo {

	public static void main(String[] args) {
		Acc ac =new Acc();
		new Thread() {
			public void run()
			{
				ac.withdraw(15000);
			}
		}.start();
		
		new Thread() {
			public void run()
			{
				ac.deposite(20000);
			}
		}.start();

	}

}
