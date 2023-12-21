package contents.twenty.myanswer;

import java.util.List;

public class Answer020 {
	private static final String[] MEDALS = new String[] {"GOLD", "SILVER", "BRONZE"};

	public static void main(String[] args) {
		// ジェネリクスを使う場合
		List.of(MEDALS).forEach(System.out::println);

		// ジェネリクスを使わない場合
		List medals = List.of(MEDALS);
		medals.forEach(System.out::println);
	}
}
