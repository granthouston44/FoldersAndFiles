package com.codeclan.example.FilesAndFolders.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilesRepository extends JpaRepository<File, Long> {
}
