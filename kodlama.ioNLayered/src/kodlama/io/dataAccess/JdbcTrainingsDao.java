package kodlama.io.dataAccess;

import kodlama.io.entities.Trainings;

public class JdbcTrainingsDao implements ITrainingsDao{

	@Override
	public void add(Trainings train) {
		System.out.println("Training added by JDBC");
		
	}

}
