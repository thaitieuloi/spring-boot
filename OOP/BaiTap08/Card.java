package com.ttl.oop.b8;

import com.ttl.oop.b2.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private Student student;
    private String id;
    private int borrowDate;
    private int paymentDate;
    private int bookId;

}
