package zoosimulator;

import java.util.ArrayList;

public class Zoo<T extends Paddock<T>> {
	private String name;
	private Worker worker;
	private static final int MAX_PADDOCK = 10;
    private ArrayList<T> paddocks = new ArrayList<>(MAX_PADDOCK);
	
	
	public static void main(String[] args) {

	}

}
