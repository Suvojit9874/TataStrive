package Thread;

class Acc1
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
		//notify();
		notifyAll();
	}
	synchronized void display() throws InterruptedException
	{
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Fetching your acc balance");
		for(int c=0;c<=5;c++)
		{
			Thread.sleep(1000);
			System.out.print(".");
		}
		System.out.println("\n your present account balance is: "+this.accBalance);
	}
	}
public class NotifyAll{

	public static void main(String[] args) {
		Acc1 ac=new Acc1();
		new Thread() {
			public void run()
			{
				ac.withdraw(15000);
			}
		}.start();
		new Thread()
		{
			public void run() {
				
				try {
					ac.display();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
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