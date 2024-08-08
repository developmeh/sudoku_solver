package solutionOne;

public record Gameboard(char[][] gameboard) {
    public int width() {
        return this.gameboard[0].length;
    }

    public int length() {
        return this.gameboard.length;
    }
}
