public class Validator {
    private static final String VOLID_CHARACTERS = "abvgdefhijklnmopqrstuvwxyzQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";

    private Validator() {
    }


    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            checkUsingLoop(login, password, confirmPassword);
            return true;
        } catch (WrongPasswordException | WrongLoginException var4) {
            System.out.println(var4.getMessage());
            return false;
        }
    }
    private static void checkUsingLoop(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login != null && login.length() <= 20) {
            if (password != null && password.equals(confirmPassword)) {
                if (password != null && password.length() <= 20) {
                    for(int i = 0; i < 1; ++i) {
                        if (!"abvgdefhijklnmopqrstuvwxyzQWERTYUIOPASDFGHJKLZXCVBNM0123456789_".contains(String.valueOf(login.charAt(i)))) {
                            throw new WrongPasswordException("У тебя в логине не верный символ");
                        }
                    }

                } else {
                    throw new WrongPasswordException("Дилна пароля меньше 20 символов стого");
                }
            } else {
                throw new WrongPasswordException("Пароль не совападает");
            }
        } else {
            throw new WrongLoginException("Проверь длину логина, на более 20 символов");
        }
    }
}