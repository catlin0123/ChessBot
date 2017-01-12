package gamelogic.pieces;

import gamelogic.Board;
import gamelogic.location.Location;

import java.util.List;

public abstract class Piece {
    private Location location;
    private boolean hasMoved = false;

    public Location getLocation() {
        return location;
    }

    /**
     * Moves the piece to the location, but only if it is a valid location for the piece to move to.
     * @param l The location to move the piece to.
     */
    public boolean moveToLocation(Location l, Board b) {
        boolean isValid = isValidMove(l, b);
        if (isValid) {
            location = l;
            hasMoved = true;
        }
        return isValid;
    }

    /**
     * Returns if a given location is a valid location to move to on the board given its current location.
     * @param l The location to move to.
     * @param b The board we are moving on.
     * @return If the location is a valid location for this piece to move to on the given board.
     */
    public boolean isValidMove(Location l, Board b) {
        return getValidMoves(b).contains(l);
    }

    /**
     * Gets a list of valid move for this piece to move to given the current board configuration.
     * @param board The board to get valid moves for the piece on.
     * @return A list of valid moves for that piece.
     */
    public abstract List<Location> getValidMoves(Board board);
}
