package mementoPattern.impl;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	
	private List<Memento> mementoLst = new ArrayList<Memento>();
	
	public void add(Memento memento){
		mementoLst.add(memento);
	}
	
	public Memento get(int index){
		return mementoLst.get(index);
	}

}
