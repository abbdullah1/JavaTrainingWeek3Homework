package kodlama.io.entities;

public class Trainings {
private int trainingId;
private String traininName;
private int trainingPrice;
private String trainingDescription;

public Trainings() {
	
}

public Trainings(int trainingId, String traininName, int trainingPrice, String trainingDescription) {
	super();
	this.trainingId = trainingId;
	this.traininName = traininName;
	this.trainingPrice = trainingPrice;
	this.trainingDescription = trainingDescription;
}

public int getTrainingId() {
	return trainingId;
}

public void setTrainingId(int trainingId) {
	this.trainingId = trainingId;
}

public String getTraininName() {
	return traininName;
}

public void setTraininName(String traininName) {
	this.traininName = traininName;
}

public int getTrainingPrice() {
	return trainingPrice;
}

public void setTrainingPrice(int trainingPrice) {
	this.trainingPrice = trainingPrice;
}

public String getTrainingDescription() {
	return trainingDescription;
}

public void setTrainingDescription(String trainingDescription) {
	this.trainingDescription = trainingDescription;
}


}
