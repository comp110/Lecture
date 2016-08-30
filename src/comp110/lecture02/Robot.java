package comp110.lecture02;

/* 
 * The code below is support code that will typically
 * be hidden in problem sets early on in the semester.
 * Don't stress: it will not and should not make sense yet!
 */
public class Robot {

	private Maze _maze;

	public Robot(Maze maze) {
		_maze = maze;
	}

	// Add turnLeft method below this line

	// Add turnLeft method above this line

	public void turnRight() {
		_maze.rotateMeClockwise();
	}

	public void moveForward(int steps) {
		int i = 0;
		while (i < steps) {
			_maze.moveMeForward();
			i = i + 1;
		}
	}

}