import ENTITY.OrderType;
import ENTITY.PhotoStudio;
import ENTITY.Picture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Date;

public class PhotoStudioTest {

   /* @Test
    public void addToArchive(){
        PhotoStudio photoStudio = new PhotoStudio();
        LocalDate date2 = LocalDate.of(2023, 10, 1);
        LocalDate date4 = LocalDate.of(2023, 10, 1);
        LocalDate date5 = LocalDate.of(2023, 10, 1);

        Picture picture = new Picture(1, date2, "Alice", OrderType.FAST, 0.5);
        Picture picture2 = new Picture(3, date4, "Albena", OrderType.STANDARD, 1);

        photoStudio.addToArchive(picture, date5);
        photoStudio.addToArchive(picture2, date5);
    }*/

    /*@Test
    public void displayPictureArchiveByOwnerName(){
        PhotoStudio photoStudio = new PhotoStudio();
        LocalDate date2 = LocalDate.of(2023, 10, 1);
        LocalDate date4 = LocalDate.of(2023, 10, 1);
        LocalDate date5 = LocalDate.of(2023, 10, 1);

        Picture picture = new Picture(1, date2, "Alice", OrderType.FAST, 0.5);
        Picture picture2 = new Picture(3, date4, "Bob", OrderType.STANDARD, 1);
        Picture picture3 = new Picture(2, date4, "Albena", OrderType.STANDARD, 1);

        photoStudio.addToArchive(picture3, date5);
        photoStudio.addToArchive(picture2, date5);
        photoStudio.addToArchive(picture, date5);

        photoStudio.displayPictureArchiveByOwnerName();
    }*/

    @Test
    public void displayPictureArchiveByOwnerNameContainingIvan(){
        PhotoStudio photoStudio = new PhotoStudio();
        LocalDate date2 = LocalDate.of(2023, 10, 1);
        LocalDate date4 = LocalDate.of(2023, 10, 1);
        LocalDate date5 = LocalDate.of(2023,10,1);

        Picture picture = new Picture(1, date2, "Bob", OrderType.FAST, 0.5);
        Picture picture2 = new Picture(3, date4, "Ivan", OrderType.STANDARD, 1);
        Picture picture3 = new Picture(2, date4, "Ivan", OrderType.STANDARD, 1);

        photoStudio.addToArchive(picture3, date5);
        photoStudio.addToArchive(picture2, date5);
        photoStudio.addToArchive(picture, date5);

        photoStudio.displayPictureArchiveByOwnerNameContainingIvan();
    }
}
