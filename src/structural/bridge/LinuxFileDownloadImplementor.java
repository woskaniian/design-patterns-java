package structural.bridge;

public class LinuxFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public Object download(String url) {
        System.out.println("Linux Downloader: downloading from " + url);
        return new Object();
    }

    @Override
    public void store(Object object) {
        System.out.println("Storing object in Linux");
    }
}
