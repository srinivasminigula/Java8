package com.j8.interfaces;

@FunctionalInterface
public interface BiConsumer<T, U> {
	void accept(T t, U u);
}