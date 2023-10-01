import ENTITY.Order;
import ENTITY.PhotoStudio;
import ENTITY.Picture;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        PhotoStudio photoStudio = new PhotoStudio();

        Picture picture = new Picture(1, new Date(), "Alice", Order.FAST, 1024);
        Picture picture2 = new Picture(3, new Date(), "John", Order.STANDARD, 512);
        Picture picture3 = new Picture(2,new Date(), "Alex", Order.EXPRESS, 2048);

        photoStudio.addPicture(picture);
        photoStudio.addPicture(picture2);
        photoStudio.addPicture(picture3);

        photoStudio.showPictures();
    }
}
