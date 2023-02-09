package ru.job4j.array;

public class JavaNameValidator {

    /**
     * Метод проверяет валидность имени переменной.
     * <p>
     * Переменная может содержать символы латинского алфавита и числа,
     * символ подчеркивания и символ доллара.
     * Переменная должна начинаться на строчную латинскую букву.
     *
     * @param name Имя переменной
     * @return true если имя переменной валидное, иначе false.
     */
    public static boolean isNameValid(String name) {
        boolean isValid = !name.isEmpty() && isLowerLatinLetter(name.codePointAt(0));
        if (isValid) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!isUpperLatinLetter(code)
                        && !isLowerLatinLetter(code)
                        && !isSpecialSymbol(code)
                        && !Character.isDigit(name.charAt(i))) {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }

    /**
     * Метод проверяет является ли символ знаком доллара или нижнее подчеркивание.
     *
     * @param code номер символа в Unicode
     * @return true, если символ является символом доллара и нижнее подчеркивание, иначе false
     */
    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    /**
     * Метод проверяет является ли символ прописным латинским символом.
     *
     * @param code номер символа в Unicode
     * @return true, если символ является прописным латинским символом, иначе false
     */
    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    /**
     * Метод проверяет является ли символ строчным латинским символом.
     *
     * @param code номер символа в Unicode
     * @return true, если символ является строчным латинским символом, иначе false
     */
    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
