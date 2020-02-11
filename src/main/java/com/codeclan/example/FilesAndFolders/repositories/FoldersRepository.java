package com.codeclan.example.FilesAndFolders.repositories;

import com.codeclan.example.FilesAndFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoldersRepository extends JpaRepository<Folder, Long> {
}
