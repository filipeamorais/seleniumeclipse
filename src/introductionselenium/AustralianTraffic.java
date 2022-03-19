package introductionselenium;

public class AustralianTraffic implements CentralTraffic,ContinentalInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
		
		AustralianTraffic at = new AustralianTraffic();
		at.walkOnSymbol();
		
		ContinentalInterface ct = new AustralianTraffic();
		ct.trainSymbol();
		

	}
	
	public void walkOnSymbol() {
		System.out.println("walking");
	};

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow");
		
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		
	}

}
