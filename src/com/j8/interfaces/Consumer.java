package com.j8.interfaces;

@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
}
