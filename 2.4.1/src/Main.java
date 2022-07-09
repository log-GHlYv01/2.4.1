public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        boolean result = Validator.validate("te_9128", "Y_1qWe987", "Y_1qWer987");
        if (result) {
            System.out.println("Логин порлоь верны =) (.)(.)");
        } else {
            System.out.println("Логин или пароль косячные .|.");
        }
    }
}
