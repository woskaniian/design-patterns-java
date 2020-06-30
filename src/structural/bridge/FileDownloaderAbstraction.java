package structural.bridge;

public interface FileDownloaderAbstraction {
    Object download(String url);

    void store(Object object);
}
