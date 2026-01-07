import static java.util.Objects.isNull;

public class Word {

	private final String answer = "APPLE";

	public void valid(String input) {
		// TODO. 정책 논의 필요 (횟수 차감 여부)

		validNull(input);

		validLength(input);

		validAlphabet(input);

	}

	public void validNull(String input) {
		if (isNull(input)) {
			throw new IllegalArgumentException("잘못된 입력입니다.");
		}
	}

	public void validLength(String input) throws IllegalArgumentException {
		if (input.length() != 5) {
			throw new IllegalArgumentException("길이가 일치하지 않습니다.");
		}
	}

	public void validAlphabet(String input) {
		if (!input.toLowerCase().matches("[a-z]")) {
			throw new IllegalArgumentException("단어는 알파벳이어야 합니다.");
		}
	}
}
