import java.util.Objects;

/**
 * Класс, представляющий задачу с идентификатором, приоритетом и описанием.
 */
public class Task {
    private int id;
    private int priority;
    private String description;

    public Task(int id, int priority, String description) {
        this.id = id;
        this.priority = priority;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && priority == task.priority && Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, priority, description);
    }
}