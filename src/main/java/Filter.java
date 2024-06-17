import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> list) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number >= f) {
                logger.log("Элемент " + "\"" + number + "\"" + " проходит");
                result.add(number);
            } else {
                logger.log("Элемент " + "\"" + number + "\"" + " не проходит");
            }
        }
        return result;
    }
}
