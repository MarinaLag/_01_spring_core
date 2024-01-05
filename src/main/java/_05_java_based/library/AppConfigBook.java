package _05_java_based.library;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class AppConfigBook {
    @Bean
    public List<Book> books() {
        return List.of(
                new Book("Bukvar"),
                new Book("Kama s utra"),
                new Book("Kama s vechera")
        );
    }

    @Bean
    public Library library() {
        return new Library(1);
    }


}
