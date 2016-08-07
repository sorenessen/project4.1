package switchcase;

public class WeekDay {
	
	public String getWeekDay(String day){
		String taskToDo = "";
		day = day.toLowerCase();
		switch(day){
		
		case "monday": taskToDo= "Start with CodeLab";break;
		case "tuesday": taskToDo= "Join Mentoring session-1 by Jawad Newaj";break;
		case "wednesday": taskToDo= "Join Mentoring session-2 by Kaya Begum";break;
		case "thursday": taskToDo= "Homework is due";break;
		case "friday": taskToDo= "Prepare for the quiz and complete the quiz on Friday night";break;
		case "saturday": taskToDo= "Our Java class is in session";break;
		case "sunday": taskToDo= "Review of CodeLab assignment";break;
		default: taskToDo = "Out of weekdays";break;
		
		}
		
		return taskToDo;
	}

}
