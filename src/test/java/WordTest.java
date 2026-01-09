import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WordTest {

    @Test
    void Word_길이_5인경우_검증이_성공한다() {
        // given
        Word word = new Word("APPLE");
        // when
        // then
        Assertions.assertDoesNotThrow(() -> word.validLength(word.getAnswer()));
    }

    @Test
    void Word_길이_4인경우_검증이_실패한다() {
        // given
        Word word = new Word("APPL");
        // when
        IllegalArgumentException illegalArgumentException = assertThrows(
            IllegalArgumentException.class, () -> word.validLength(word.getAnswer()));
        // then
        Assertions.assertEquals("길이가 일치하지 않습니다.", illegalArgumentException.getMessage());
    }

    @Test
    void Word_길이_6인경우_검증이_실패한다() {
        // given
        Word word = new Word("APPLEA");
        // when
        IllegalArgumentException illegalArgumentException = assertThrows(
            IllegalArgumentException.class, () -> word.validLength(word.getAnswer()));
        // then
        Assertions.assertEquals("길이가 일치하지 않습니다.", illegalArgumentException.getMessage());
    }
}
