package tylermaxwell.allbooks.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tylermaxwell.allbooks.models.Book;
import tylermaxwell.allbooks.services.BookService;

import java.util.List;

@Controller
public class BookController {

    // use dependency injection to have access to our service
    @Autowired
    BookService bookService;

    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        System.out.println(books);
        return "index.jsp";
    }

    @GetMapping("/books/{bookId}")
    public String index(@PathVariable("bookId") Long bookId, Model model){
        System.out.println(bookId);
        Book book = bookService.findBook(bookId);
        model.addAttribute("book", book);
        return "show.jsp";
    }
}
