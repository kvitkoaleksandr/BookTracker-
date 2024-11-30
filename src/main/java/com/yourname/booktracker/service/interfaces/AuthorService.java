package com.yourname.booktracker.service.interfaces;

import com.yourname.booktracker.model.Author;

import java.time.LocalDateTime;
import java.util.List;

public interface AuthorService {
    List<Author> findMostPopularAuthors(LocalDateTime startDate, LocalDateTime endDate);
}
