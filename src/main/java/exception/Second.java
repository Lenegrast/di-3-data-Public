package exception;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Second {

    public static void main(String[] args) {
        try {
            demoCustomException(true); // Здесь бросится исключение
        } catch (CustomException e) {
            System.out.println("Поймано свое исключение: " + e.getMessage());
        }

        try {
            demoCustomException(false); // Здесь не бросится исключение
        } catch (CustomException e) {
            System.out.println("Поймано свое исключение: " + e.getMessage());
        }
    }

    public static void demoCustomException(boolean shouldThrow) throws CustomException {
        if (shouldThrow) {
            throw new CustomException("Это мое исключение");
        } else {
            System.out.println("Без исключения");
        }
    }
}