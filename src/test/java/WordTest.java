import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WordTest {

    @Test
    void compareAnswer() {

        // given
        Result result = new Result();
        Answer answer = new Answer();
        Input input = new Input("AIRPO", result);
        Word word = new Word(input, answer);
        // when
        word.compareAnswer();
        // then
        Assertions.assertEquals("🟩⬜⬜🟨⬜", result.getBoard());
    }
}