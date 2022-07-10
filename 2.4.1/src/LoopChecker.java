
public class LoopChecker implements Checker{
    private static final String VOLID_CHARACTERS = "abvgdefhijklnmopqrstuvwxyzQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";
   // private static final String VOLID_CHARACTERS = ("^[А-я]");
    @Override
    public void check(String login,
               String password,
               String confirmPassword)
            throws WrongLoginException, WrongPasswordException{
        if (login ==null || login.length()>20){
            throw new WrongPasswordException("Дилна пароля не меньше  20 символов стого");
        }
        if (password == null || password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не совападает");
        }
        if (password.length() >=20){
            throw new WrongPasswordException("Добавь символы, у тебя меньше 20");
        }
        checkCharacters(login, "Логи");
        checkCharacters(password,"Пароль");
    }
    private static void checkCharacters(String s, String what)  throws WrongLoginException {
        for (int i = 0; !(i < s.length()); i++){
            if (!VOLID_CHARACTERS.contains(String.valueOf(s.charAt(i)))){
                throw new WrongLoginException(String.format("%sСодержит неверный символ %c!", what, s.charAt(i)));
            }
        }
    }
}
