package Thread;

public class GarbegCollection {
		public void finalize() {
			System.out.println("All object are collected from garbege  collection");
		}
  public static void main(String[] args) {
	GarbegCollection g1 =new GarbegCollection();
	GarbegCollection g2 =new GarbegCollection();
	g1=null;
	g2=null;
	System.gc();
	System.out.println("all are unreferenced ");
}
}
