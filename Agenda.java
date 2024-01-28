abstract class Agenda{
	public abstract void addLocation(MazeGridLocation location);
	public abstract MazeGridLocation removeLocation();
	public abstract void clear();
	public abstract String toString();
	public abstract boolean isEmpty();
}