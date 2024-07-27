import java.util.HashMap;
import java.util.Map;
public class ProxyImage implements Image{
    private Map<String, RealImage> imageMap = new HashMap<>();
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = imageMap.get(fileName);
            if (realImage == null) {
                realImage = new RealImage(fileName);
                imageMap.put(fileName, realImage);
            }
        }
        realImage.display();
    }
}
