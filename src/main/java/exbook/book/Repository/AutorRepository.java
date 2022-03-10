package exbook.book.Repository;

import exbook.book.Entity.AutorModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends CrudRepository<AutorModel, Integer> {
}
