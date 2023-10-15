package designPatterns;

interface Image {
    void display();
}

class RealImage implements Image {
    String fileName;

    RealImage(String fileName) {
        this.fileName = fileName;
        loadImage(fileName);
    }

    void loadImage(String fileName) {
        System.out.println("Loaded from Disk ---> ");
    }

    @Override
    public void display() {
        System.out.println("Displaying --->  " + fileName);
    }
}

class ProxyImage implements Image {

    RealImage realImage;
    String fileName;

    ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("sample.log");
        image.display();   //loading first time
        System.out.println("-----------");
        image.display();   //loading second time
    }
}
