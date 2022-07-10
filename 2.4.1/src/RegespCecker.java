public class RegespCecker implements Checker{
    private static final String VOLID_CHARACTERS = "abvgdefhijklnmopqrstuvwxyzQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";

    @Override
    public void check(String login,
                      String password,
                      String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login == null || !login.matches("^\\w{0,20}$")) {
            throw new WrongPasswordException("Дилна пароля не меньше  20 символов стого");
        }
        if (password == null || password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не совападает");
        }
        if (!password.matches("^\\w{0,19}$")) {
            throw new WrongPasswordException("Дилна пароля  меньше  20 символов стого");
        }
    }
}
