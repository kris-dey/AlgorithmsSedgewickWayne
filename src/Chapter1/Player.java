package Chapter1;

public class Player {
	String name;
	int runs;
	int matches;
	public Player(String name, int runs, int matches) {
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", runs=" + runs + ", matches=" + matches + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
}
