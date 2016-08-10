package com.jayqqaa12.design;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 实现 迭代器
 *
 * 难度2星
 *
 */
class PeekingIterator implements Iterator<Integer> {
	private List<Integer> list =new ArrayList<>();
	private  int index =-1;
	private  int size ;

	public PeekingIterator(Iterator<Integer> iterator) {

		while (iterator.hasNext())list.add(iterator.next());
		size=list.size();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {

		return index+1<size?list.get(index+1):null;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {

		return index+1<size?list.get(++index):null;
	}

	@Override
	public boolean hasNext() {
		return index+1<size;
	}
}