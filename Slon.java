public class Slon {

    private static final String GREETING = """
            Привет!
            Я продаю слона!
            Для справки используй /help
            Купи слона!""";
    private static final String TEMPLATE = "Все говорят \"%s\", а ты купи слона!";
    private static final String HELP = """
              /help  - показать это сообщение
              /exit  - выйти из программы
            На любое другое сообщение будет дразнилка.""";

    public String greeting() {
        return GREETING;
    }

    public String handle(String input) {
        String trimmed = input == null ? "" : input.trim();

        switch (trimmed.toLowerCase()) {
            case "/exit":
                return null;
            case "/help":
                return HELP;
            default:
                return String.format(TEMPLATE, trimmed);
        }
    }
}