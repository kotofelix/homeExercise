package homeExerciseIsupov;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<MailContent<T>>{

    private Map<String, List<T>> store = new HashMap<>();

    @Override
    public void accept(MailContent<T> msg) {
        store.computeIfAbsent(msg.getTo(), k -> new LinkedList<>()).add(msg.getMailContent());
    }

    public Map<String, List<T>> getMailBox() {
        return new HashMap<>(this.store);
    }
}
