package structural.bridge;

public abstract class FileDownloaderAbstraction {
    protected FileDownloadImplementor fileDownloadImplementor;

    public FileDownloaderAbstraction(FileDownloadImplementor fileDownloadImplementor) {
        this.fileDownloadImplementor = fileDownloadImplementor;
    }

    public abstract Object download(String url);

    public abstract void store(Object object);
}
