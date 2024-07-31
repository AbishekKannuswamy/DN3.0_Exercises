package ProxyPatternExample;

interface Image {
    void show();
}

class RealImage implements Image {
    private String file;

    public RealImage(String file) {
        this.file = file;
        loadImageFromDisk(file);
    }

    private void loadImageFromDisk(String file) {
        System.out.println("Loading " + file);
    }

    public void show() {
        System.out.println("Displaying " + file);
    }
}

class ProxyImage implements Image {
    private RealImage realImage;
    private String file;

    public ProxyImage(String file) {
        this.file = file;
    }

    public void show() {
        if (realImage == null) {
            realImage = new RealImage(file);
        }
        realImage.show();
    }
}
