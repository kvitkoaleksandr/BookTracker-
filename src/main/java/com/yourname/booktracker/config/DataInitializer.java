package com.yourname.booktracker.config;

import com.yourname.booktracker.model.*;
import com.yourname.booktracker.repository.interfaces.AuthorRepository;
import com.yourname.booktracker.repository.interfaces.BookRepository;
import com.yourname.booktracker.repository.interfaces.ReaderRepository;
import com.yourname.booktracker.repository.interfaces.TransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

//@Configuration
//public class DataInitializer {
//
//    @Bean
//    CommandLineRunner initData(
//            AuthorRepository authorRepository,
//            BookRepository bookRepository,
//            ReaderRepository readerRepository,
//            TransactionRepository transactionRepository) {
//        return args -> {
//            // Создание авторов
//            Author author1 = new Author();
//            author1.setFirstName("J.K.");
//            author1.setLastName("Rowling");
//            author1.setBirthDate(LocalDate.of(1965, 7, 31));
//
//            Author author2 = new Author();
//            author2.setFirstName("George");
//            author2.setLastName("Orwell");
//            author2.setBirthDate(LocalDate.of(1903, 6, 25));
//
//            authorRepository.saveAll(Set.of(author1, author2));
//
//            // Создание книг
//            Book book1 = new Book();
//            book1.setTitle("Harry Potter and the Sorcerer's Stone");
//            book1.setYear(1997);
//            book1.setAuthors(Set.of(author1));
//
//            Book book2 = new Book();
//            book2.setTitle("1984");
//            book2.setYear(1949);
//            book2.setAuthors(Set.of(author2));
//
//            bookRepository.saveAll(Set.of(book1, book2));
//
//            // Создание читателей
//            Reader reader1 = new Reader();
//            reader1.setPhoneNumber("1234567890");
//            reader1.setFirstName("Alice");
//            reader1.setLastName("Smith");
//            reader1.setGender(Gender.FEMALE);
//            reader1.setBirthDate(LocalDate.of(1990, 5, 15));
//
//            Reader reader2 = new Reader();
//            reader2.setPhoneNumber("9876543210");
//            reader2.setFirstName("Bob");
//            reader2.setLastName("Johnson");
//            reader2.setGender(Gender.MALE);
//            reader2.setBirthDate(LocalDate.of(1985, 8, 20));
//
//            readerRepository.saveAll(Set.of(reader1, reader2));
//
//            // Создание транзакций
//            Transaction transaction1 = new Transaction();
//            transaction1.setTransactionType(TransactionType.BORROW);
//            transaction1.setTransactionDateTime(LocalDateTime.now());
//            transaction1.setReader(reader1);
//            transaction1.setBook(book1);
//
//            Transaction transaction2 = new Transaction();
//            transaction2.setTransactionType(TransactionType.RETURN);
//            transaction2.setTransactionDateTime(LocalDateTime.now().minusDays(10));
//            transaction2.setReader(reader2);
//            transaction2.setBook(book2);
//
//            transactionRepository.saveAll(Set.of(transaction1, transaction2));
//        };
//    }
//}
