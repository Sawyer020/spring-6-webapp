package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

/*
 Created by jt, Spring Framework Guru
 */
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String firstName;
    private String lastName;

    //many 'authors' to many 'books'
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Set<Book> getBooks(){
        return books;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

