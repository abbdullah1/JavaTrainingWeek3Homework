package kodlama.io.dataAccess;

import kodlama.io.entities.Instructors;

public class HibernateInstructorsDao implements IInstructorsDao {

	@Override
	public void add(Instructors instructor) {
		System.out.println("Instructor added by Hibernate");
		
	}

}
