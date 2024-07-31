package pieces;

import boardgame.Board;
import boardgame.Position;
import chess.Color;

public class King extends chess.ChessPiece{
    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
