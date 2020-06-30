package structural.bridge;

public interface FileDownloadImplementor {
    Object download(String url);

    void store(Object object);
}
