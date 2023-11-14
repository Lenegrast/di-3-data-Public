package exception;

public class First {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение при делении на ноль: " + e.getMessage());
        }

        try {
            accessToUnexistingElement();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение при доступе к несуществующему элементу массива: " + e.getMessage());
        }

        try {
            playWithNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение при работе с нулевым указателем: " + e.getMessage());
        }

        try {
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException e) {
            System.out.println("Поймано исключение при создании массива отрицательного размера: " + e.getMessage());
        }

        try {
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение при попытке обращения к несуществующему индексу строки: " + e.getMessage());
        }

        System.out.println("Ура! Меня снова печают");
    }

    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < arr.length + 1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData.length());
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }
}
