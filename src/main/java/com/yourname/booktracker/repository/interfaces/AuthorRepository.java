package com.yourname.booktracker.repository.interfaces;

import com.yourname.booktracker.model.Author;
import com.yourname.booktracker.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a, COUNT(t.id) as transactionCount " +
            "FROM Transaction t " +
            "JOIN t.book b " +
            "JOIN b.authors a " +
            "WHERE t.transactionType = :transactionType " +
            "AND t.transactionDateTime BETWEEN :startDate AND :endDate " +
            "GROUP BY a.id " +
            "ORDER BY transactionCount DESC")
    List<Object[]> findMostPopularAuthors(@Param("transactionType") TransactionType transactionType,
                                          @Param("startDate") LocalDateTime startDate,
                                          @Param("endDate") LocalDateTime endDate);
}
