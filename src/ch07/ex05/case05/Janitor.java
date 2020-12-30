package ch07.ex05.case05;

@FunctionalInterface
public interface Janitor<T> {
	void clean(T t);
}
