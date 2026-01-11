import static java.util.Objects.isNull;

public class Word {

    private Answer answer;
    private Input input;

    public Word(Input input, Answer answer) {
        this.input = input;
        this.answer = answer;
    }

    public void valid() {
        // TODO. 정책 논의 필요 (횟수 차감 여부)

        validNull(input.getValue());

        validLength(input.getValue());

        validAlphabet(input.getValue());

    }

    public void validNull(String input) {
        if (isNull(input)) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }

    public void validLength(String input) throws IllegalArgumentException {
        if (input.length() != WordCondition.입력_제한_길이.getValue()) {
            throw new IllegalArgumentException("길이가 일치하지 않습니다.");
        }
    }

    public void validAlphabet(String input) {
        if (!input.matches("(?i)[a-z]+")) {
            throw new IllegalArgumentException("단어는 알파벳이어야 합니다.");
        }
    }

    // 입력 : APPLE
    // 답 : AIRPO
    public void compareAnswer() {
        String answer = this.answer.getValue();
        String input = this.input.getValue();

        for (int i = 0; i < answer.length(); i++) {
            char answerChar = answer.charAt(i);
            char inputChar = input.charAt(i);

            if (answerChar == inputChar) {
                this.input.saveTile(ResultValues.그린.getValue());
                continue;
            }

            if (answer.indexOf(inputChar) >= 0) {
                this.input.saveTile(ResultValues.옐로우.getValue());
                continue;
            }

            this.input.saveTile(ResultValues.그레이.getValue());
        }
    }

}
