package ui;

import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;

public class FileBrowser extends FileSystemView {

    @Override
    public File createNewFolder(File containingDir) {
        return null;
    }
    
}
