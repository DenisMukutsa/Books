package Books;

import java.util.Arrays;

public class Book {
    private String name;
    private Publisher publisher;
    private int yearOfpublishing;
    private String[] authors;
    private String author;

    public Book(String name, int yearOfpublishing, Publisher publisher) {
        setName(name);
        setYearOfPublishing(yearOfpublishing);
        setPublisher(publisher);
    }

    public Book(String name, String[] authors, int yearOfpublishing, Publisher publisher) {
        this(name, yearOfpublishing, publisher);
        setAuthors(authors);
    }

    public Book(String name, String author, int yearOfpublishing, Publisher publisher) {
        this(name, yearOfpublishing, publisher);
        setAuthor(author);
    }


    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getYearOfPublishing() {
        return yearOfpublishing;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfauthors() {
        return authors.length;
    }

    public String getAuthor(int i) {
        if(i >= 0 && i < authors.length) {
            return authors[i];
        }
        else {
            throw new IllegalArgumentException ();
        }
    }

    public void setName(String name) {
        if(name != null & !name.equals("")) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException ();
        }
    }

    public void setPublisher(Publisher publisher) {
        if(publisher != null) {
            this.publisher = publisher;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setYearOfPublishing(int yearOfpublishing) {
        if(yearOfpublishing > 0) {
            this.yearOfpublishing = yearOfpublishing;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setAuthors(String[] authors) {
        if(authors != null) {
            this.authors = authors;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void setAuthor(String author) {
        if(author != null && !author.equals(" ")) {
            this.author = author;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public void print() {
        if(getAuthor() != null && !getAuthor().equals("")) {
            System.out.println("Название книги: " + getName() + "; автор: " + getAuthor() + "; издательство: " + getPublisher().getNameOfpublisher() + ", " + getPublisher().getCity() + "; год издания: " + getYearOfPublishing() );
        }
        else if(getAuthors() != null && getAuthors().length > 0) {
            System.out.println("Название книги: " + getName() + "; авторы: " + Arrays.toString(getAuthors()) + "; издательство: " + getPublisher().getNameOfpublisher() + ", " + getPublisher().getCity() + "; год издания: " + getYearOfPublishing() );
        }
        else {
            System.out.println("Название книги: " + getName() + "; издательство: " + getPublisher().getNameOfpublisher() + ", "+ getPublisher().getCity()  + "; год издания: " + getYearOfPublishing());
        }
    }
    public static void printAll(Book[] books) {
        for(Book book : books) {
            book.print();
        }
    }
}
