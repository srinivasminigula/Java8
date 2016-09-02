package com.j8.interfaces;

@FunctionalInterface
public interface BiPredicate<T, U> {
	boolean test(T t, U u);
}
