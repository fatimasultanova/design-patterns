package structual.proxy;

public class FileService implements FileServiceInter{

    @Override
    public void read() {
        System.out.println("read file");
    }

    @Override
    public void write() {
        System.out.println("written file");
    }
}
