package kodlama.io.dataAccess;

import kodlama.io.entities.Categories;

public class JdbcCategoriesDao implements ICategoriesDao {

	@Override
	public void add(Categories category) {
		System.out.println("Category added by JDBC");
		
	}

}
