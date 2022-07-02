package github.daniedev.collectionsassessment;

@FunctionalInterface
public interface Condition {
    boolean isValid(Person p);
}
