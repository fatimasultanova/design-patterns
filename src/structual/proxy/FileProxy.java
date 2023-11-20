package structual.proxy;

public class FileProxy implements FileServiceInter{

    private FileServiceInter fileServiceInter;
    private String role;

    public FileProxy( String role) {
        this.fileServiceInter = new FileService();
        this.role = role;
    }

    @Override
    public void read() {
        if (role == null){
            System.err.println("Access denied!");
            return;
        }
        fileServiceInter.read();

    }

    @Override
    public void write() {
        if (role.equalsIgnoreCase("admin")){
            fileServiceInter.write();
        }else {
            System.err.println("Access denied!");
        }


    }
}
