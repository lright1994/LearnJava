package buaa.lright;

abstract class Component{}
class File extends Component{public String fileName;}
class Folder extends Component{
    Component[] coms;
    public String folderName;

    public void SetCom(Component[] source){
        this.coms = source;
    }

    public void Scan(){
        for(Component f : coms){
            if(f instanceof File){
                System.out.println("File: "+((File)f).fileName);
            }else if(f instanceof Folder){
                System.out.println("Folder: " + ((Folder)f).folderName);
                ((Folder)f).Scan();
            }
        }
    }
}

class Composite{
    public static void main(String[] args) {
        File f1 = new File();f1.fileName = "file1";
        File f2 = new File();f2.fileName = "file2";
        File f3 = new File();f3.fileName = "file3";

        Folder fo1 = new Folder(); fo1.folderName = "folder1";
        Folder fo2 = new Folder(); fo2.folderName = "folder2";

        fo1.SetCom(new Component[]{f1,f2});
        fo2.SetCom(new Component[]{fo1,f2,f3});

        fo2.Scan();
    }
}
