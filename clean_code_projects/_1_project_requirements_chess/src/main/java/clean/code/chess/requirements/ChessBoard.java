package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
       // throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
        if(IsLegalBoardPosition(xCoordinate, yCoordinate)){
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setChessBoard(this);
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
      //  throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
        return ((xCoordinate < 7 && xCoordinate > -1) && (yCoordinate < 7 && yCoordinate > -1));
    }
}
