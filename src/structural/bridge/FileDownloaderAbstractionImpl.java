package structural.bridge;

public class FileDownloaderAbstractionImpl extends FileDownloaderAbstraction {


    public FileDownloaderAbstractionImpl(FileDownloadImplementor fileDownloadImplementor) {
        super(fileDownloadImplementor);
    }

    @Override
    public Object download(String url) {
        return this.fileDownloadImplementor.download(url);
    }

    @Override
    public void store(Object object) {
        this.fileDownloadImplementor.store(object);
    }
}
