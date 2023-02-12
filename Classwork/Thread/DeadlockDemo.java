package Thread;
public class DeadlockDemo {

	public static void main(String[] args) {
		final String r1="Paper";
		final String r2="Pen";
		//Thread1//bipul lock resource1:paper and wanted to lock resource 2:pen
		Thread bipul=new Thread() {
			public void run()
			{
				synchronized(r1)
				{
					System.out.println("Bipul locked Resource1:paper");
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//Thread 1:bipul wanted to lock resource2:pen
					synchronized(r2)
					{
						System.out.println("Wanted to lock resource 2:Pen");
					}
				}
			}
		};
		//Thread2:koushik lock resource2:pen and wanted to lock resource 1:paper
				Thread koushik=new Thread() {
					public void run()
					{
						synchronized(r1)
						{
							System.out.println("koushik locked Resource2:pen");
							try {
								Thread.sleep(400);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							//Thread 1:bipul wanted to lock resource2:pen
							synchronized(r2)
							{
								System.out.println("Wanted to lock resource 1:paper");
							}
						}
					}
				};
				bipul.start();
				koushik.start();

	}

}