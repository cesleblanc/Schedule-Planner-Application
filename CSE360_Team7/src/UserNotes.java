
public class UserNotes {
	
	private String description; 
	private String dueDate; 
	private String priority;
	private String dateStarted; 
	private String dateFinished;
	private String status;
	//private enum STATUS { INPROGRESS, NOTSTARTED, FINISHED }; NOT NEEDED
	
	public UserNotes() { 
		this.description = "";
		this.dueDate = "";
		this.priority = ""; 
		this.status = "";
	}
	
	
	public UserNotes(String description, String dueDate, String priority, String status) {
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getPriority() {
		return priority;
	}
	public String getStatus() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDateStarted() {
		return dateStarted;
	}


	public void setDateStarted(String dateStarted) {
		this.dateStarted = dateStarted;
	}


	public String getDateFinished() {
		return dateFinished;
	}


	public void setDateFinished(String dateFinished) {
		this.dateFinished = dateFinished;
	};
	
	@Override
	public String toString() {
		return "UserNotes [description=" + description + ", dueDate=" + dueDate + 
				", priority=" + priority + ", dateStarted=" + dateStarted + ", dateFinished=" + dateFinished + "]";
	}
	
}
