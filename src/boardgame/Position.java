package boardgame;

public class Position {
	private int row;
	private int column;
	
	public Position(int row, int collum) {
		this.row = row;
		this.column = collum;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int collum) {
		this.column = collum;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
