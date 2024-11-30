package com.yourname.booktracker.repository.interfaces;

import com.yourname.booktracker.model.Reader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReaderRepository extends JpaRepository<Reader, String> {
}
