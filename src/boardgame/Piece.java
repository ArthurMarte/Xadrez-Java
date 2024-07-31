package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    //constructor
    public Piece(Board board) {
        this.board = board;
    }

    public Piece(Position position, int color) {
    }

    public Board getBoard() {
        return board;
    }
}
