package kodlama.io.dataAccess;

import kodlama.io.entities.Instructors;

public class JdbcInstructorsDao implements IInstructorsDao{

	@Override
	public void add(Instructors instructor) {
		System.out.println("Instructor added by JDBC");
		
	}

}
