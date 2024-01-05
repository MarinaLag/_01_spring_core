package _05_java_based.library;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.StringJoiner;

public class Library {
    private int id;
    private List<Book> books;

    public Library(int id) {
        this.id = id;
    }

    public List<Book> getBooks() {
        return books;
    }

    //@Autowired – над полем не рекомендуется. или конструктор или над сеттером
    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Library.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("books=" + books)
                .toString();
    }


}
