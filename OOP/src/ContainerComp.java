import java.util.ArrayList;
import java.util.List;

public class ContainerComp {
	private int maxSize;
	private int currentSize;
	private List<Luggage> luggages= new ArrayList();
	
	public void put(Luggage lug) {
		if(!cnaContain(lug))
			throw new NotEnoughSpaceException();
		super.add(lug);
	}
}
