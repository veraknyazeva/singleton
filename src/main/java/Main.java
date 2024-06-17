import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу ");
        logger.log("Просим пользователя ввести входные данные для списка ");
        Scanner console = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int n = console.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int m = console.nextInt();
        logger.log("Создаём и наполняем список ");

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int rnd = random.nextInt(m);
            list.add(rnd);
            builder.append(rnd).append(" ");
        }
        System.out.println("Вот случайный список: " + builder);
        logger.log("Просим пользователя ввести входные данные для фильтрации ");
        System.out.print("Введите порог для фильтра: ");
        int f = console.nextInt();

        Filter filter = new Filter(f);
        List<Integer> result = filter.filterOut(list);
        logger.log("Прошло фильтр " + result.size() +  " элемента из " + n);
        logger.log("Выводим результат на экран ");
        String listToString = result.toString();
        listToString = listToString.replace("[", "");
        listToString = listToString.replace("]", "");
        listToString = listToString.replaceAll(",", "");
        System.out.println("Отфильтрованный список: " + listToString );
        logger.log("Завершаем программу ");

    }
}
