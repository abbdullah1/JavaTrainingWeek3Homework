package kodlama.io.dataAccess;

import kodlama.io.entities.Trainings;

public class HibernateTrainingsDao implements ITrainingsDao {

	@Override
	public void add(Trainings train) {
		System.out.println("Category added by Hibernate");
		
	}

}
