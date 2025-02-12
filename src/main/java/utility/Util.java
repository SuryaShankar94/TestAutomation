package utility;

import base.TestSetup;

import java.io.File;

public class Util extends TestSetup {


    public static boolean isFileDownloaded(String filePath, String fileExtension)
    {
        File file = new File(filePath);
        File[] files = file.listFiles();
        Boolean isFileDownloadFromApp = files[0].getName().contains(fileExtension);
        return isFileDownloadFromApp;
    }
}
