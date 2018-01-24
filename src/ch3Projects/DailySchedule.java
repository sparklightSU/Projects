package ch3Projects;

import java.util.ArrayList;

public class DailySchedule {
	private ArrayList<Appointment> appList;
	
	public DailySchedule() {
		appList = new ArrayList();
	}
	public void clearConflicts(Appointment appt) {
		for(int i = 0; i < appList.size(); i++) {
			Appointment app = appList.get(i);
			if(app.conflictsWith(appt))
				appList.remove(i);
		}
	}
	public boolean addAppt(Appointment appt, boolean emergency) {
		if(emergency) {
			appList.add(appt);
			return true;
		}
		else {
			for(int i=0; i < appList.size(); i++) {
				if (!appList.get(i).conflictsWith(appt)) {
					appList.add(appt);
					return true;
				}
			}
			return false;
		}
	}
}
