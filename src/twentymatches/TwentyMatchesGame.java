package twentymatches;

public class TwentyMatchesGame {

    static final int AMOUNT_OF_MATCHES_IN_GAME = 20;
    static private int matchesOnTable;
    static private boolean playerTurn;

    public static int getMatchesOnTable() {
        return matchesOnTable;
    }

    public static boolean isPlayerTurn() {
        return playerTurn;
    }

    public static void setMatchesOnTable(int matchesOnTable) {
        TwentyMatchesGame.matchesOnTable = matchesOnTable;
    }

    public static void setPlayerTurn(boolean playerTurn) {
        TwentyMatchesGame.playerTurn = playerTurn;
    }

}
