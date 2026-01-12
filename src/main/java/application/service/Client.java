package application.service;

import application.port.OutputPort;
import domain.model.Result;
import domain.model.Word;
import domain.service.Game;

public class Client {

    private final Word word;
    private final Game game;
    private final Result result;
    private final OutputPort outputPort;

    public Client(Word word, Game game, Result result, OutputPort outputPort) {
        this.word = word;
        this.game = game;
        this.result = result;
        this.outputPort = outputPort;
    }

    public String run() {
        game.checkedTryCount();

        word.valid();
        word.compareAnswer();

        game.updateFinished();

        result.addBoard();

        return outputPort.getBoards(result.getBoards());
    }
}
