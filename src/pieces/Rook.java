package pieces;


import boardgame.Board;
import boardgame.Position;
import chess.Color;

public class Rook extends chess.ChessPiece{

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

}
