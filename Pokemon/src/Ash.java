import java.util.*;

public class Ash {
	private double caught;
	Square position = new Square(0,0);
	public TreeSet <Square> path = new TreeSet<Square>();
	
	//Class Constructor, will initialize "Ash" on a Square, in the position (0,0) 
	public Ash() {
		path.add(position);
		this.caught = 1;
	}
	private void Move (String input) {
		char move;
		int n = input.length();
		for(int i = 0; i < n; i++ ) {
			move = input.charAt(i);
			Square new_pos = new Square(position.getPos_x(), position.getPos_y());
			
			switch(move) {
				case 'N': 
					new_pos.setPos_y(new_pos.getPos_y() +1);
					new_pos.down = position;
					position.up = new_pos;
					break;
				case 'S': 
					new_pos.setPos_y(new_pos.getPos_y() - 1);
					new_pos.up = position;
					position.down =new_pos;
					break;
				case 'E': 
					new_pos.setPos_x(new_pos.getPos_x() + 1);
					new_pos.left = position;
					position.right=new_pos;
					break;
				case 'O':
					new_pos.setPos_x(new_pos.getPos_x()-1);
					new_pos.right = position;
					position.left = new_pos;
					break;
				default: System.out.println("A direction inserted is not valid!");
			}
			
			//If the new position is not in the tree already, it will be added and a new pokemon is caught
			if(path.add(new_pos)) {
				caught ++;
			}
		}
	}
}
