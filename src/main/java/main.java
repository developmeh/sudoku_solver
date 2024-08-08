import solutionOne.Gameboard;
import solvers.Solver;
import solvers.SolverOne;
import system.Container;

public class main {
    public static void main(String[] args) {
        char[][] gameboard = {
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

        Gameboard startingBoard = new Gameboard(gameboard);
        Solver solver = new SolverOne(startingBoard, Container.gridInspections);
        Gameboard finalGameboard = solver.solve();

    }
}

