package kodlama.io.bussiness;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.IInstructorsDao;
import kodlama.io.entities.Instructors;

public class InstructorsManager {

	private IInstructorsDao instructorsDao;
	private Logger[] logger;

	
	public InstructorsManager() {
	
	}

	public InstructorsManager(IInstructorsDao instructorsDao,Logger[] logger) {
		
		this.instructorsDao = instructorsDao;
		this.logger=logger;
	}
	
	public void add(Instructors instructors) {
		this.instructorsDao.add(instructors);
	}
}
