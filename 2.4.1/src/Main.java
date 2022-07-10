public class Main {

    public static void main(String[] args) {
        boolean result = Validator.validate(
                "te_00000000000000000",
                "Y_1qWe987",
                "Y_1qWer987");
        if (result) {
            System.out.println("Логин порлоь верны =) (.)(.)");
        } else {
            System.out.println("Логин или парол ь косячные .|.");
        }
    }
}
