package chess;

import boardgame.Board;
import boardgame.Position;
import pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        init();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i< board.getRows(); i++){
            for(int j=0; j < board.getColumns(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }


    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }


    private void init(){
        for(int i=1; i< 2; i++){
            for(int j=0; j<getPieces().length; j++){
                board.placePiece(new Rook(board, Color.white), new Position(i,j));
            }
        }

        for(int i=6; i==6; i++){
            for(int j=0; j<getPieces().length; j++){
                board.placePiece(new Rook(board, Color.black), new Position(i,j));
            }
        }
    }
}
