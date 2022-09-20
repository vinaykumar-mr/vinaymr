package treebo.genericUtility;

public enum TabName {
ACTIVITIES("Activities"), ACCOUNTS("Accounts"), STUDENT("Student"), EXPENSES("Expenses"), 
TRANSACTION("Transaction"), OPTIONS("Options"), LOGOUT("Logout");
	private String tabName;
	TabName(String tabName){
		this.tabName=tabName;
	}
	public String getTabName() {
		return tabName;
	}
}
