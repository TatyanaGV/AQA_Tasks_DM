public class LaunchTest {

    //Task3
    //Есть 2 переменных Boolean isProd и String county
    //В зависимости от значений этих переменных нужно вывести сообщение
    //если isProd = true, вывести “Нельзя запускать тест на продакшене”
    //если country=”RU”, вывести “Запускаю тест”
    //если country=”KZ” или “BY”, вывести “Не запускаю тест, фича есть только в РФ”
    //при любом другом значении country, вывести “Некорректное значение страны”
    //Написать код так, чтобы “if” встречалось максимум 3 раза

    public void launchTest (boolean isProd, String country) {
        if (isProd) {
            System.out.println("Нельзя запускать тест на продакшене");
        } else if (country.equals("KZ") || country.equals("BY")) {
            System.out.println("Не запускаю тест, фича есть только в РФ");
        } else if (country.equals("RU")) {
            System.out.println("Запускаю тест");
        } else {
            System.out.println("Некорректное значение страны");
        }
    }
}
