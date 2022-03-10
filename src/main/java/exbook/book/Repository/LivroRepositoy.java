package exbook.book.Repository;

import exbook.book.Entity.BookModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepositoy extends CrudRepository<BookModel, Integer> {
}
