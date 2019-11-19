package lab11.stopWatch;

import javafx.beans.property.StringProperty;

public class TimeModel {

	private StringProperty no;
	private StringProperty lapTime;
	private StringProperty total;
	
	public TimeModel(StringProperty no, StringProperty lapTime, StringProperty total) {
		this.no = no;
		this.lapTime = lapTime;
		this.total = total;
	}
	
	public StringProperty noProperty() {
		return no;
	}
	
	public StringProperty lapTimeProperty() {
		return lapTime;
	}
	
	public StringProperty totalProperty() {
		return total;
	}
}
