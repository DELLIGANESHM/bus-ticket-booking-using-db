package busreservation;

public class Bus {
            

	private int busno;
  private   boolean Ac;
   private int Capacity;
   


	public Bus(int no, boolean ac, int cap) {
		this.busno=no;
		this.Ac=ac;
		this.Capacity=cap;	
	}
	
	
	public int getBusno() {
	return busno;
}

public boolean GetAc() {
	return Ac;
}

public void setAc(boolean ac) {
	Ac = ac;
}

public int getCapacity() {
	return Capacity;
}

public void setCapacity(int cap) {
	Capacity = cap;
}

  public void displayinfo(){
	System.out.println("Busno : "+ busno +" Ac : " + Ac + " Capacity : " + Capacity );
}
}
