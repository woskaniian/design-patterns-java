package structural.bridge;

public class WindowsFileDownloadImplementor implements FileDownloadImplementor {
    @Override
    public Object download(String url) {
        System.out.println("Windows Downloader: downloading from " + url);
        return new Object();
    }

    @Override
    public void store(Object object) {
        System.out.println("Stroing object in Windows");
    }
}
