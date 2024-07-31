package chess;

import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    //constructor
    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating position!! Valid values: a-h, 1-8");
        }
        this.column = column;
        this.row = row;
    }

    //getter
    public void setColumn(char column) {
        this.column = column;
    }
    public void setRow(int row) {
        this.row = row;
    }

    //methods
    //converte uma posição de xadrez para uma posição da matriz
    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    //converte uma posição da matriz para uma posição de xadrez
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getRow()), 8- position.getColumn());
    }

    @Override
    public String toString(){
        return "" + column + row;
    }


}
