package service.serviceCategory;

import model.Category;
import repository.repoCategory.CategoryRepoImpl;
import repository.repoCategory.ICategoryRepo;

import java.util.List;

public class CategoryServiceImpl implements ICategoryService{
    ICategoryRepo categoryRepo = new CategoryRepoImpl();
    @Override
    public List<Category> displayCategory() {
        return categoryRepo.displayCategory();
    }
}
