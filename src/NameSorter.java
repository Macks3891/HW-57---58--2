import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Класс для сортировки списка имен.
 */
public class NameSorter {

    /**
     * Сортирует список имен в обратном порядке с использованием анонимного класса.
     *
     * @param names Список имен для сортировки.
     */
    public void sortWithAnonymousClass(List<String> names) {
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name2.compareTo(name1);
            }
        });
    }

    /**
     * Сортирует список имен в обратном порядке с использованием лямбда-выражения.
     *
     * @param names Список имен для сортировки.
     */
    public void sortWithLambda(List<String> names) {
        names.sort((name1, name2) -> name2.compareTo(name1));
    }
}