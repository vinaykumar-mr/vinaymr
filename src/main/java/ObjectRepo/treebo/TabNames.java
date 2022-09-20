package ObjectRepo.treebo;

public enum TabNames {
	ACTIVITIES("Activities"), ACCOUNTS("Accounts"), STUDENT("Student"), EXPENSES("Expenses"), 
	 TRANSACTION("Transaction"), OPTIONS("Options"), LOGOUT("Logout");
	
	private String tabName;
	TabNames(String tabName){
		this.tabName=tabName;
	}
	public String getTabName() {
		return tabName;
	}
}
