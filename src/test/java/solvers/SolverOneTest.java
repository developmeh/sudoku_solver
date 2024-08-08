package solvers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import solutionOne.Gameboard;
import system.Container;

import static org.junit.jupiter.api.Assertions.*;
class SolverOneTest {
  SolverOne subject;
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

  char[][] oneByOne = {
    {'5','3','.'},
    {'.','7','.'},
    {'.','.','.'}
  };


  @BeforeEach
  void setup() {
    subject = new SolverOne(new Gameboard(threeByThree), Container.gridInspections);
  }

  @Test
  void testGetGridTest() {
    subject.solve();
  }

  @Test
  void demoTestMethod() {
    assertTrue(true);
  }
}