public class Validator {
   // private static final Checker CHECKER_1 = new LoopChecker();
    private static final Checker CHECKER_2 = new RegespCecker();

    private Validator() {
    }


    public static boolean validate(String login,
                                   String password,
                                   String confirmPassword) {
        try {
           // CHECKER_1.check(login, password, confirmPassword);
            CHECKER_2.check(login, password, confirmPassword);
            return true;
        } catch (WrongPasswordException | WrongLoginException var4) {
            System.out.println(var4.getMessage());
            return false;
        }
    }


}