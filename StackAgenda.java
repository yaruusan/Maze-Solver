import java.util.ArrayList;

public class StackAgenda extends Agenda{
	ArrayList<MazeGridLocation> stack;

	public StackAgenda(){
		stack = new ArrayList<>();
	}

	public void addLocation(MazeGridLocation loc) {
		stack.add(loc);
	}

	public MazeGridLocation removeLocation() {
		return stack.remove(stack.size() - 1);
	}

	public void clear() {
		stack.clear();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public String toString() {
		StringBuilder stringBuild = new StringBuilder();
		for (MazeGridLocation loc : stack) {
			stringBuild.append(loc.toString());
			stringBuild.append(" ");
		}
		return stringBuild.toString();
	}
}