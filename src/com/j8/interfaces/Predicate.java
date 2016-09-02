package com.j8.interfaces;

@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
