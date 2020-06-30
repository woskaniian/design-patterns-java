package structural.bridge;

public class FileDownloaderAbstractionImpl implements FileDownloaderAbstraction {

    private FileDownloadImplementor fileDownloadImplementation;

    public FileDownloaderAbstractionImpl(FileDownloadImplementor fileDownloadImplementation) {
        this.fileDownloadImplementation = fileDownloadImplementation;
    }

    @Override
    public Object download(String url) {
        return this.fileDownloadImplementation.download(url);
    }

    @Override
    public void store(Object object) {
        this.fileDownloadImplementation.store(object);
    }
}
