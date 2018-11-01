package zoosimulator;

public class EggPaddock<T extends Egg<Oviparous>> extends Paddock<T> {

	public EggPaddock(String name, double length, double width) {
		super(name, length, width);
		
	}

	@Override
	void setSpecialState(State s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	State getSpecialState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getSpecialStateString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getSpecialDimension() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getVolume() {
		// TODO Auto-generated method stub
		return null;
	}

}
