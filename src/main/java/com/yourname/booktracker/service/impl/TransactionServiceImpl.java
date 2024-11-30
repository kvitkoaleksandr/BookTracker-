package com.yourname.booktracker.service.impl;

import com.yourname.booktracker.model.Book;
import com.yourname.booktracker.model.Reader;
import com.yourname.booktracker.model.Transaction;
import com.yourname.booktracker.model.TransactionType;
import com.yourname.booktracker.repository.interfaces.BookRepository;
import com.yourname.booktracker.repository.interfaces.ReaderRepository;
import com.yourname.booktracker.repository.interfaces.TransactionRepository;
import com.yourname.booktracker.service.interfaces.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;
    private final BookRepository bookRepository;
    private final ReaderRepository readerRepository;

    @Override
    public Transaction createTransaction(Long bookId, String readerPhoneNumber, String transactionType) {
        // Найти книгу
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new IllegalArgumentException("Книга не найдена"));

        // Найти читателя
        Reader reader = readerRepository.findById(readerPhoneNumber).orElseThrow(() -> new IllegalArgumentException("Читатель не найден"));

        // Создать транзакцию
        Transaction transaction = new Transaction();
        transaction.setBook(book);
        transaction.setReader(reader);
        transaction.setTransactionType(TransactionType.valueOf(transactionType.toUpperCase()));
        transaction.setTransactionDateTime(LocalDateTime.now());

        // Сохранить транзакцию
        return transactionRepository.save(transaction);
    }
}