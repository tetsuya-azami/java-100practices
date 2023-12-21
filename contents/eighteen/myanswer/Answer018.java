package contents.eighteen.myanswer;

import java.util.Arrays;

public enum Answer018 {
	NE(1L, "ねずみ"), USHI(2L, "うし"), TORA(3L, "とら"), U(4L, "うさぎ"), TATSU(5L, "たつ"), MI(6L, "へび"), UMA(
			7L, "うま"), HITSUJI(8L,
					"ひつじ"), SARU(9L, "さる"), TORI(10L, "とり"), INU(11L, "いぬ"), I(12L, "いのしし");

	private Long id;
	private String name;

	private Answer018(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public static Answer018 getEnumById(Long id) {
		return Arrays.stream(values()).filter(e -> e.id.equals(id)).findFirst().orElse(null);
	}

	public static Answer018 getEnumByName(String name) {
		return Arrays.stream(values()).filter(e -> e.name.equals(name)).findFirst().orElse(null);
	}
}
