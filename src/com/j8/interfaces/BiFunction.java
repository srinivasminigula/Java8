package com.j8.interfaces;

@FunctionalInterface
public interface BiFunction<T, R> {
	R apply(T t);
}
