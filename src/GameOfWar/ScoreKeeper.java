package GameOfWar;

public class ScoreKeeper {

	private int playerScore = 0;
	private int opponentScore = 0;
	private int gamesPlayer = 0;

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public int getOpponentScore() {
		return opponentScore;
	}

	public void setOpponentScore(int opponentScore) {
		this.opponentScore = opponentScore;
	}

	public int getGamesPlayer() {
		return gamesPlayer;
	}

	public void setGamesPlayer(int gamesPlayer) {
		this.gamesPlayer = gamesPlayer;
	}

	public ScoreKeeper(int playerScore, int opponentScore, int gamesPlayer) {
		super();
		this.playerScore = playerScore;
		this.opponentScore = opponentScore;
		this.gamesPlayer = gamesPlayer;
	}

}
