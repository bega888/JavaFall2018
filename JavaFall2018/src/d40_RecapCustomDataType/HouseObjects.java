package d40_RecapCustomDataType;

public class HouseObjects {
	public static void main(String[] args) {
		
		House h1=new House();
		House h2=new House();
		House h3=new House();
		House h4=new House();
		
		h1.type="Condo";
		h1.address="8439 W Catherine Ave, Chicago, IL";
		h1.numRums=4;
		
		h2.type="Apartment";
		h2.address="2435 W Lawrence Ave, Chicago, IL";
		h2.numRums=3;
		
		h3.type="Family";
		h3.address="8429 W Delphia Ave, Chicago, IL";
		h3.numRums=8;
		
		h4.type="Mansion";
		h4.address="129 W Deev Rd, Chicago, IL";
		h4.numRums=14;
		
		System.out.println(h1.type+" house, and it has "+h1.numRums+" rooms, address is: "+h1.address);
		
		
		
		
		
		
	}

}
