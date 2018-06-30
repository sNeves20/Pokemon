/**
 * Attributes : int pos_x - position of the x coordinate of the node in the grid, the starting nodes' position will be x = 0
 * 			    int pos_y - position of the y coordinate of the node in the grid, the starting nodes' position will be y = 0
 * 
 * Constructor: Receives an int x and int y, these will be set as the attributes pos_x and pos_y, respectively
 *  
 * Methods: getPos_X() - returns the value of the pos_x attribute
 * 			getPos_y() - returns the value of the pos_y attribute
 * 			setPos_x() - argument: int pos_x
 * 						 Defines the objects' pos_x attribute equal to the argument x
 * 			setPos_y() - argument: int y
 * 						 Defines the objects' pos_y attribute equal to the argument y
 * 			equals(Object obj) -  returns a boolean
 * 								  If the obj is the same as the one that calls the function, or if it's pos_x and pos_y
 * 								  values are the same, the function returns true, otherwise it returns false
 * 			hashCode() - returns an int
 * 						 declare a prime number (31) and does operations on the positions (x,y). Two objects that are
 * 						 equals() (the equals method returns true), must have the same hashCode()
 * 			toString() - returns a string
 * 						 Used for debugging, sending out a string with the position x and y
 * 
 * **/
public class Square{
	
	//Coordinates of the square
	private int pos_x, pos_y;
	
	public Square(int x, int y) {
		this.pos_x = x;
		this.pos_y = y;
	}
	
	
	//Getters of the x and y position
	public int getPos_x() {
		return pos_x;
	}

	public int getPos_y() {
		return pos_y;
	}
	//Setters of the x and y coordinates
	public void setPos_x(int x) {
		this.pos_x = x;
	}

	public void setPos_y(int y) {
		this.pos_y = y;
	}

	
	//equals and hashCode overridden functions
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pos_x;
		result = prime * result + pos_y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		if (pos_x != other.pos_x || pos_y != other.pos_y)
			return false;
		return true;
	}
	
	//Used to print the attributes of the class, pos_x and pos_y
	@Override
	public String toString() {
		return "Square [pos_x=" + pos_x + ", pos_y=" + pos_y + "]";
	}	
	
}
