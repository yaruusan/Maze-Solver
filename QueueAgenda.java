import java.util.ArrayList;

public class QueueAgenda extends Agenda{
	ArrayList<MazeGridLocation> queue;

	public QueueAgenda(){
		queue = new ArrayList<>();
	}

	public void addLocation(MazeGridLocation loc) {
		queue.add(loc);
	}

	public MazeGridLocation removeLocation() {
		return queue.remove(0);
	}

	public void clear() {
		queue.clear();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public String toString() {
		StringBuilder stringBuild = new StringBuilder();
		for (MazeGridLocation loc : queue) {
			stringBuild.append(loc.toString());
			stringBuild.append(" ");
		}
		return stringBuild.toString();
	}
}