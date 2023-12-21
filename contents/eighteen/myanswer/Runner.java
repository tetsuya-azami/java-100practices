package contents.eighteen.myanswer;

public class Runner {
	public static void main(String[] args) {
		System.out.println(Answer018.getEnumById(1L));
		System.out.println(Answer018.getEnumByName("ねずみ"));
		System.out.println(Answer018.getEnumById(100L));
		System.out.println(Answer018.getEnumByName("hoge"));
	}
}
