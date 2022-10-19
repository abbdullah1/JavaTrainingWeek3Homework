package kodlama.io.dataAccess;

import kodlama.io.entities.Categories;

public class HibernateCategoriesDao implements ICategoriesDao {

	@Override
	public void add(Categories categories) {
		System.out.println("Category added by Hibernate");
		
	}

}
