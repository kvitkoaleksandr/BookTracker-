package com.yourname.booktracker.repository.interfaces;

import com.yourname.booktracker.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    @Query("SELECT a AS author, COUNT(t) AS transactionCount " +
            "FROM Transaction t " +
            "JOIN t.book b " +
            "JOIN b.authors a " +
            "WHERE t.transactionType = 'BORROW' AND t.transactionDateTime BETWEEN :startDate AND :endDate " +
            "GROUP BY a " +
            "ORDER BY transactionCount DESC")
    List<Object[]> findMostPopularAuthors(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);
}