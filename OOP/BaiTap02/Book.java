package com.ttl.oop.b2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Document {
    private String author;
    private int numerPage;

    public Book(Document docuement, String author, int numberPage) {
        super(docuement.getId(), docuement.getNxb(), docuement.getNumber());
        this.author = author;
        this.numerPage = numberPage;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", numerPage=" + numerPage +
                ", id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
