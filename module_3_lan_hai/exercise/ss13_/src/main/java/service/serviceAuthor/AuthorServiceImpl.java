package service.serviceAuthor;

import model.Author;
import repository.repoAuthor.AuthorRepoImpl;
import repository.repoAuthor.IAuthorRepo;

import java.util.List;

public class AuthorServiceImpl implements  IAuthorService{
    IAuthorRepo authorRepo = new AuthorRepoImpl();
    @Override
    public List<Author> displayAuthor() {
        return authorRepo.displayAuthor();
    }
}
