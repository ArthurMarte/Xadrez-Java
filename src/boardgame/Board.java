package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    //constructor
    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1){
            throw new BoardException("Erro criando tabuleiro..");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    //getters and setters
    public int getRows() {
        return rows;
    }
    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }


    //methods
    public Piece piece(int rows, int columns){
        if(!positionExists(rows, columns)){
            throw new BoardException("Position does not exists!");
        }
        return pieces[rows][columns];
    }
    public Piece piece (Position position){
        if(positionExists(position)){
            throw new BoardException("Position does not exists!");
        }
        return pieces[position.getRow()][position.getColumn()];
    }


    //método para tratar execções
    public boolean positionExists(int row, int colum){
        return (row >= 0 && row < rows && colum >= 0 && colum < columns);
    }
    public boolean positionExists(Position position){
        return !positionExists(position.getRow(), position.getColumn());
    }
    public boolean theresAPiece(Position position){
        if(positionExists(position)){
            throw new BoardException("Position does not exists!");
        }
        return (piece(position) != null);
    }


    public void placePiece(Piece piece, Position position){
        if(theresAPiece(position)){
            throw new BoardException("The is already a piece on position " + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if(piece(position) == null){
            return null;
        }else{
            Piece aux = piece(position);
            aux.position = null;
            pieces[position.getRow()][position.getColumn()] = null;
            return aux;
        }
    }
}



