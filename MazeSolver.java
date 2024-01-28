import java.util.ArrayList;
import java.util.Collections;

class MazeSolver{
	public Agenda a;
	
	public MazeSolver(Agenda a){
		this.a = a;
	}

	/**
	 * Solves the maze and return the solution path from start to goal
	 * @param m, the maze
	 * @param mg, the mazeGUI
	 * @return ArrayList of solution path MazeGridLocations from start to goal
	 */
	public ArrayList<MazeGridLocation> solveMaze(Maze m, MazeGUI mg){
		a.clear();
		ArrayList<MazeGridLocation> path = new ArrayList<>();

		MazeGridLocation start = m.getStartLocation();
		MazeGridLocation goal = m.getGoalLocation();
		
		// Set up array to save which location is reachable from which location
		MazeGridLocation[][] previous = new MazeGridLocation[m.getNumRows()][m.getNumColumns()];
		a.addLocation(start);

		while(!a.isEmpty()){
			MazeGridLocation currLoc = a.removeLocation();
			mg.visitLoc(currLoc);
			m.markVisited(currLoc);

			if(currLoc.equals(goal)){
				while(!currLoc.equals(start)){
					path.add(currLoc);
					mg.addLocToPath(currLoc);
					currLoc = previous[currLoc.getRow()][currLoc.getColumn()];
				}
				path.add(start);
				Collections.reverse(path);
				return path;
			}

			ArrayList<MazeGridLocation> neighbors = m.getOpenNeighbors(currLoc);
			for(MazeGridLocation loc : neighbors){
				if(!m.isVisited(loc)){
					a.addLocation(loc);
					mg.addLocToAgenda(loc);
					previous[loc.getRow()][loc.getColumn()] = currLoc;
				}
			}
		}
		
		// Return empty ArrayList when there is no solution path
		return new ArrayList<>();
	}
}