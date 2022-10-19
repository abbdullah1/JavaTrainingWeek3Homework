package kodlama.io.bussiness;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.ICategoriesDao;
import kodlama.io.entities.Categories;

public class CategoriesManager {
private ICategoriesDao icategoriesDao;
private Categories[] categories;
private Logger[] logger;


public CategoriesManager() {
	
}

public CategoriesManager(ICategoriesDao icategoriesDao, Categories[] categories, Logger[] logger) {
	
	this.icategoriesDao = icategoriesDao;
	this.categories = categories;
	this.logger = logger;
}

public void add(Categories category) {
	for (Categories category1 : categories) {
		if(category1.getCategoryName()==category1.getCategoryName() && category1.getCategoryId()==category1.getCategoryId()) {
			System.out.println("category name cannot repeat");
		}
		else {
			this.icategoriesDao.add(category1);
		}
	}
}
}
