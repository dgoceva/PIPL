
public class Counter {
	protected long count = 0;
	
	public void add(long value) {
//		read-modify-write
//		count=0
//		A: read count into register => register=0
//		B: read count into register => register=0
//		B: modify register => register=register+2
//		B: write register to count => count=2
//		A: modify register => register=register+3
//		A: write register to count => count=3
		count += value;
	}
	public void add(long v1, long v2) {
//		synchronized (this) {
//			count += v1+v2;
//		}
		synchronized (this) {
			count += v1;
		}
		synchronized (this) {
			count +=v2;
		}
	}
}
