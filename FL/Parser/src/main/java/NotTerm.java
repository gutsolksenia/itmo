import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ksenia on 06.06.17.
 */
public class NotTerm extends Token {
    private final List<List<Token>> rules = new ArrayList<>();

    public NotTerm(String name) {
        super(name);
    }

    @Override
    public boolean isTerminal() {
        return false;
    }

    public List<List<Token>> getRules() {
        return rules;
    }

    public void addRule(List<Token> rule) {
        rules.add(rule);
    }
}
