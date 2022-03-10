package exbook.book.Services;


import exbook.book.Entity.AutorModel;
import exbook.book.Repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorServices {

    @Autowired
    private AutorRepository autorRepository;

    public List<AutorModel> getAutorList(){
        Iterable<AutorModel> autorModelIterable = this.autorRepository.findAll();
       return Streamable.of(autorModelIterable).toList();
    }
}
