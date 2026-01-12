package structures.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public Sets() {
    }

    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("C");
        hashSet.add("B");
        hashSet.add("D");
        hashSet.add("A");
        hashSet.add("A");

        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        linkedHashSet.add("A");

        return linkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("B");
        treeSet.add("O");
        treeSet.add("B");
        treeSet.add("a");

        return treeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        linkedHashSet.add("A");

        return linkedHashSet;
    }
}
