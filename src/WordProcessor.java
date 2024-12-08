import java.util.List;
import java.util.stream.Collectors;

/**
 * Класс для обработки списка строк с использованием Stream API.
 */
public class WordProcessor {

    /**
     * Преобразует все строки в верхний регистр, выбирает строки длиной больше 4 символов,
     * сортирует их по длине и возвращает результат в виде нового списка.
     *
     * @param words Список строк для обработки.
     * @return Отсортированный список строк.
     */
    public List<String> processWords(List<String> words) {
        return words.stream()
                .filter(word -> word.length() > 4) // Выберем строки длиной больше 4 символов
                .map(String::toUpperCase) // Преобразуем все строки в верхний регистр
                .sorted((word1, word2) -> word1.length() - word2.length()) // Отсортируем по длине
                .collect(Collectors.toList()); // Соберём результат в новый список
    }
}