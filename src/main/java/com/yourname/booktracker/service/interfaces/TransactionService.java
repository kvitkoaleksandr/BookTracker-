package com.yourname.booktracker.service.interfaces;

import com.yourname.booktracker.model.Transaction;

public interface TransactionService {
    Transaction createTransaction(Long bookId, String readerPhoneNumber, String transactionType);
}
