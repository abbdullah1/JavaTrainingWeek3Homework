package kodlama.io.bussiness;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.ITrainingsDao;
import kodlama.io.entities.Trainings;

public class TrainingsManager {
private ITrainingsDao iTrainingsDao;
private Trainings[] trainings;
private Logger[] logger;


public TrainingsManager() {
	
}


public TrainingsManager(ITrainingsDao iTrainingsDao, Trainings[] trainings,Logger[] logger) {
	
	this.iTrainingsDao = iTrainingsDao;
	this.trainings = trainings;
	this.logger=logger;
}

public void add(Trainings trainings) {
	for (Trainings training : this.trainings) {
		if(training.getTraininName()==training.getTraininName() && training.getTrainingId()==training.getTrainingId()) {
		System.out.println("Training name cannot repeat");
	}
	if(training.getTrainingPrice()<0) {
		System.out.println("Training price cannot be less than 0 ");
	}
	else {
		this.iTrainingsDao.add(trainings);
	}
}


}
}