import java.util.ArrayList;
import java.util.List;

/**
 * Created by ksenia on 06.06.17.
 */
public class Tree {
    private final String value;
    private final List<Tree> childern = new ArrayList<>();

    public Tree(String value) {
        this.value = value;
    }

    public String getVal() {
        return value;
    }

    public List<Tree> getChildern() {
        return childern;
    }

    public void addChild(Tree child) {
        this.childern.add(child);
    }
}
