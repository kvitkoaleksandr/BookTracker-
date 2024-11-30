package com.yourname.booktracker.service.impl;

import com.yourname.booktracker.model.Author;
import com.yourname.booktracker.model.TransactionType;
import com.yourname.booktracker.repository.interfaces.AuthorRepository;
import com.yourname.booktracker.service.interfaces.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public List<Author> findMostPopularAuthors(LocalDateTime startDate, LocalDateTime endDate) {
        // Используем метод репозитория для получения данных
        List<Object[]> results = authorRepository.findMostPopularAuthors(TransactionType.BORROW, startDate, endDate);

        // Преобразуем результат в список авторов
        return results.stream()
                .map(result -> (Author) result[0]) // Извлечение автора из массива
                .collect(Collectors.toList());
    }
}