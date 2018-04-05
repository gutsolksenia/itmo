import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ksenia on 06.06.17.
 */
public class Token {
    private final String name;
    private final List<List<Token>> rules = new ArrayList<>();
    private Set<String> first = new HashSet<>();
    private Set<String> follow = new HashSet<>();

    public Token(String name) {
        this.name = name;
        if (isTerminal()) {
            first.add(name);
        }
    }

    public boolean isTerminal() {
        return true;
    }

    public Set<String> getFirst() {
        return first;
    }

    public void addFirst(String value) {
        first.add(value);
    }

    public String getName() { return name; }

    public Set<String> getFollow() {
        return follow;
    }

    public void addFollow(String value) {
        follow.add(value);
    }
}
