package com.yourname.booktracker.controller;

import com.yourname.booktracker.model.Transaction;
import com.yourname.booktracker.service.interfaces.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Transaction> createTransaction(
            @RequestParam Long bookId,
            @RequestParam String readerPhoneNumber,
            @RequestParam String transactionType) {
        Transaction transaction = transactionService.createTransaction(bookId, readerPhoneNumber, transactionType);
        return ResponseEntity.ok(transaction);
    }
}