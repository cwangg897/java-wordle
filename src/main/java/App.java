import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Output output = new Output();

        System.out.println(output.getWelcomeMessage());
        System.out.println(output.getInputInfoMessage());

        Result result = new Result();
        Game game = new Game(result);
        Answer answer = new Answer();

        try (Scanner scanner = new Scanner(System.in)) {

            String userInput = scanner.next();
            System.out.println(userInput.length());
            Word word = new Word(new Input(userInput, result), answer);

            Client client = new Client(word, game, result);
            String gameResult = client.run();

            System.out.println(gameResult);
        }

    }

}
