package exbook.book.Controller;

import exbook.book.Entity.AutorModel;
import exbook.book.Services.AutorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.validation.Valid;
import java.awt.print.Book;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private AutorServices autorServices;

    @GetMapping("/book/form/add")
    public ModelAndView getFormAdd(){
        ModelAndView mv = new ModelAndView("bookform");
        List<AutorModel> autorlist = this.autorServices.getAutorList();
        mv.addObject("autorlist", autorlist);
        return mv;
    }

    @PostMapping("/book/form/save")
    public String saveBook(@Valid Book book, BindingResult result, RedirectAttributes redirect){

        if (result.hasErrors()){
            redirect.addFlashAttribute("mensagem","Verifique os campos obrigatórios");
            return "redirect:/book/form/add";
        }
        return "redirect:/lista";
    }
}

/*Autowired: Em tese a ideia é fazer o conceito chamado injeção de dependência.
 Indica que o objeto da classe AutorServices será instanciada aqui, podem utilizar seus métodos.
 fornece controle sobre onde e como a ligação entre os beans deve ser realizada.
 Pode ser usado para em métodos setter, no construtor, em uma propriedade
  ou métodos com nomes arbitrários e / ou vários argumentos.*/

// A classe Service intermedia o Controller com o Repository