package solvers;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutionOne.Gameboard;
import system.Container;

import static org.junit.jupiter.api.Assertions.*;

class GridInspectionsTest {
    GridInspections subject = Container.gridInspections;
    char[][] threeByThree = {
        {'5','3','.','.','7','.','.','.','.'},
        {'6','.','.','1','9','5','.','.','.'},
        {'.','9','8','.','.','.','.','6','.'},
        {'8','.','.','.','6','.','.','.','3'},
        {'4','.','.','8','.','3','.','.','1'},
        {'7','.','.','.','2','.','.','.','6'},
        {'.','6','.','.','.','.','2','8','.'},
        {'.','.','.','4','1','9','.','.','5'},
        {'.','.','.','.','8','.','.','7','9'}
    };

    Gameboard board;

    @BeforeEach
    void setUp() {
        board = new Gameboard(threeByThree);
    }

    @Test
    void getGridTestIndexZero() throws ExecutionControl.NotImplementedException {
        char[] thing = subject.getGrid(0, board);
        assert(thing.length == 9);
    }

    @Test
    void getGridTestOtherIndex() throws ExecutionControl.NotImplementedException {
        char[] thing = subject.getGrid(1, board);
        assert(thing.length == 9);
    }

    @Test
    void fromCube() {
    }

    @Test
    void fromHorizontal() {
    }

    @Test
    void fromVertical() {
    }
}