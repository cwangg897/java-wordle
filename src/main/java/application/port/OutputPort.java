package application.port;

import java.util.Objects;

public interface OutputPort {

    String getWelcomeMessage();

    String getInputInfoMessage();

    String getBoards(StringBuilder[] boards);

    String getHasNotWordRepository();
}
