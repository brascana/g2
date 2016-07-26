package g2;

public class Column {
	
	private String name;
	private int columnId;
	private boolean autoIncrement;
	private Table table;
	private boolean primaryKey;

	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public int getColumnId() {
		return columnId;
	}



	public void setColumnId(int columnId) {
		this.columnId = columnId;
	}



	public boolean isAutoIncrement() {
		return autoIncrement;
	}



	public void setAutoIncrement(boolean autoIncrement) {
		this.autoIncrement = autoIncrement;
	}



	public boolean isPrimaryKey() {
		return primaryKey;
	}



	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}



	
	
	public Table getTable() {
        return table;
	}
	
	
	
	/**
     * Set the table and column id.
     *
     * @param table the table
     * @param columnId the column index
     */
	public void setTable(Table table, int columnId) {
        this.table = table;
        this.columnId = columnId;
	}
	
	
	
}
