import java.util.Random;
public class Language {
	private String name;
	private Unit[] unitsArray;
	private int unitNumber;	
	
	public Language(String name ) {// only name needed when generating this class.
    	this.name = name;
    	Random rand = new Random();
    	unitNumber = rand.nextInt(60, 101); // generates a random number between 60 and 100
    	unitsArray = new Unit[unitNumber];
    	createUnits();      
    }
	

    public int getUnitNumber() {
		return unitNumber;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Unit[] getUnitsArray() {
		return unitsArray;
	}

	public void createUnits() {       
	        for(int i= 0; i < unitNumber ; i ++) {
	        	Unit unit = new Unit(name);
	        	unitsArray[i] = unit;
	        }
	}
	
}
