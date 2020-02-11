package com.codeclan.example.FilesAndFolders.components;

import com.codeclan.example.FilesAndFolders.models.ExtensionType;
import com.codeclan.example.FilesAndFolders.models.File;
import com.codeclan.example.FilesAndFolders.models.Folder;
import com.codeclan.example.FilesAndFolders.models.User;
import com.codeclan.example.FilesAndFolders.repositories.FileRepository;
import com.codeclan.example.FilesAndFolders.repositories.FolderRepository;
import com.codeclan.example.FilesAndFolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Override
public void run(ApplicationArguments args)    {


        Folder folder1 = new Folder("First Folder");
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Second Folder");
        folderRepository.save(folder2);

        File file1 = new File("First File", ExtensionType.JAVA, folder1);
        fileRepository.save(file1);

        File file2 = new File("Second File", ExtensionType.TXT, folder1);
        fileRepository.save(file2);

        File file3 = new File("Third File", ExtensionType.JAVA, folder2);
        fileRepository.save(file3);

        File file4 = new File("Fourth File", ExtensionType.RB, folder2);
        fileRepository.save(file4);

        File file5 = new File("Fifth File", ExtensionType.TXT, folder2);
        fileRepository.save(file5);

        File file6 = new File("Sixth File", ExtensionType.PPT, folder2);
        fileRepository.save(file6);

        User user1 = new User("Yer da");
        userRepository.save(user1);
    }

}
