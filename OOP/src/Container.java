import java.util.ArrayList;

public class Container extends ArrayList<Luggage> {
	private int maxSize;
	private int currentSize;
	
	public void put(Luggage lug) {
		if(!cnaContain(lug))
			throw new NotEnoughSpaceException();
		super.add(lug);
		currentSize += lug.size();
	}

}
