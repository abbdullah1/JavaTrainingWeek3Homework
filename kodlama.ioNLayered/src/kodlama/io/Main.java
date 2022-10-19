package kodlama.io;

import kodlama.io.bussiness.CategoriesManager;
import kodlama.io.bussiness.InstructorsManager;
import kodlama.io.bussiness.TrainingsManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.HibernateCategoriesDao;
import kodlama.io.dataAccess.ICategoriesDao;
import kodlama.io.dataAccess.JdbcCategoriesDao;
import kodlama.io.dataAccess.JdbcInstructorsDao;
import kodlama.io.dataAccess.JdbcTrainingsDao;
import kodlama.io.entities.Categories;
import kodlama.io.entities.Instructors;
import kodlama.io.entities.Trainings;

public class Main {

	public static void main(String[] args) throws Exception{
	Categories[] categories = new Categories[] {new Categories(1,"Back-End"),new Categories(2,"Front-End"),new Categories(3,"Web")};
		
		Instructors instructors = new Instructors(1,"Engin Demirog",30,"Software Daveloper");
		
		Trainings[] trainings = new Trainings[] {new Trainings(1,"Java",130,"comprehensive java tutorial"),new Trainings(2,"Python",100,"comprehensive python tutorial")};

		Logger[] loggers = { new DatabaseLogger(),new FileLogger(),new MailLogger()};
		
		CategoriesManager categoriesManager = new CategoriesManager(new JdbcCategoriesDao(),categories,loggers);
		for(Categories category:categories) {
			categoriesManager.add(category);
			for(Logger log:loggers) {
				log.log("Logging Succes");
			}
		}
		
		InstructorsManager instructorsManager = new InstructorsManager(new JdbcInstructorsDao(),loggers);
		instructorsManager.add(instructors);
		for(Logger log:loggers) {
			log.log("Logging Succes");
		}
		
		TrainingsManager trainingsManager = new TrainingsManager(new JdbcTrainingsDao(),trainings,loggers);
		for(Trainings training:trainings) {
			trainingsManager.add(training);
			for(Logger log:loggers) {
				log.log("Logging Succes");
			}
		}

	}

}
