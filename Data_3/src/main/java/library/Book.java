package library;

import java.util.*;

public class Book {

    private String isbn;
    private String title;
    private List<String> authors = new ArrayList<>();

    public Book(){}

    public Book(String isbn,String title,String... authors){
        this.isbn=isbn;
        this.title=title;
        this.authors.addAll(Arrays.asList(authors));
    }
    public String getIsbn(){return isbn;}

    public String getTitle(){return title;}

    public List()
}
