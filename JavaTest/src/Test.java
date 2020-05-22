import java.util.Arrays;
import java.util.stream.IntStream;

public class Test<T> implements Int{

	T t;
	public static void main(String[] args) {
		int[] a = {3, 2, -21, 5, 13};
		
		Solution s = new Solution();
		System.out.println(s.solution(a));
		Test t = new Test();
		t.set("demo");
		System.out.println(t.get());
	}
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}

}
interface Int {
	default void test() {
		System.out.println();
	}
}
