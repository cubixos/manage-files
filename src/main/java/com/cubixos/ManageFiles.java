package com.cubixos;

import java.io.File;
import java.util.*;

/**
 * The core public access point to the manage-files functionality.
 *
 * @author Cubixos
 */

public class ManageFiles {

    private ManageFiles() {
    }

    public static List<File> listFiles(String directory) {
        Set<File> fileSet = new HashSet<>();
        if (directory != null) {
            File folder = new File(directory);
            if (folder.exists()) {
                if (folder.isDirectory()) {
                    if (Objects.requireNonNull(folder.listFiles()).length > 0) {
                        fileSet.addAll(Arrays.asList(folder.listFiles()));
                    }
                }
            }
        }
        List<File> fileList = new ArrayList<>(fileSet);
        Collections.sort(fileList);
        return fileList;
    }

}
