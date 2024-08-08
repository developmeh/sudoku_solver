package solvers;

import solutionOne.Gameboard;

public class SolverOne implements Solver {
    private Gameboard gameboard = null;
    private Gameboard solution;
    private final char[][] progress;
    private final int width;
    // Taking the width in units divided by 3/3 sub cells gives us the number of subgrids in the puzzle
    // Since the total is from a square we square the grids to get the total
    // Example if the width is 9 we divide that by 3 and square it for 9
    // If it was 12x12 it would be 4x4 grids
    private final int grids;

    public SolverOne(
            Gameboard startingBoard,
            GridInspections gridTools
    ) {
        gameboard = startingBoard;
        int length = startingBoard.gameboard().length;
        width = startingBoard.gameboard()[0].length;
        grids = (width / 3)^2;
        progress = new char[length][width];
    }

    @Override
    public Gameboard solve() {
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 3; j++) {
//                for (int k = 0; k < 3; k++) {
//
//                }
//            }
//            char[] cube = fromCube();
//        }
//        char[] horizontal = fromHorizontal();
//        char[] vertical = fromVertical();
        return new Gameboard(progress);
    }
}
