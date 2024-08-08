package solvers;

import jdk.jshell.spi.ExecutionControl;
import solutionOne.Gameboard;

public class GridInspections {
    public char[] getGrid(int index, Gameboard board) throws ExecutionControl.NotImplementedException {
        int gridsPerRow = board.width() / 3;
        int row = 0;
        int col = gridsPerRow;
        if (index > 0) {
            while (col > index) {
                col = col - index;
                row ++;
            }
        }

//        for (int i = (width * row) = col )\
        throw new ExecutionControl.NotImplementedException("");
    }

    public char[] fromCube(char[] cube) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }

    public char[] fromHorizontal(char[][] horizontal) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }

    public char[] fromVertical(char[][] vertical) throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("");
    }
}
