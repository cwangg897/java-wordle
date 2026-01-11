public class Client {

    private final Word word;
    private final Game game;
    private final Result result;

    public Client(Word word, Game game, Result result) {
        this.word = word;
        this.game = game;
        this.result = result;
    }

    public String run() {

        game.checkedFinished();
        game.checkedTryCount();

        word.valid();
        word.compareAnswer();

        result.addBoard();

        return new Output().getBoards(result.getBoards());
    }
}
