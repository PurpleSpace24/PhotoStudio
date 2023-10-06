import ENTITY.OrderType;
import ENTITY.PhotoStudio;
import ENTITY.Picture;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2023, 10, 1);
        LocalDate date4 = LocalDate.of(2023, 10, 1);
        LocalDate date2 = LocalDate.of(2023, 9, 29);
        LocalDate date3 = LocalDate.of(2023, 9, 30);

        PhotoStudio photoStudio = new PhotoStudio();

        Picture picture = new Picture(1, date, "Alice", OrderType.FAST, 0.5);
        Picture picture2 = new Picture(3, date2, "Ivan", OrderType.STANDARD, 1);
        Picture picture5 = new Picture(5, date2, "Ana", OrderType.STANDARD, 5.4);
        Picture picture3 = new Picture(2,date3, "Vanesa", OrderType.EXPRESS, 3.4);
        Picture picture4 = new Picture(4,date4, "Bob", OrderType.EXPRESS, 2.1);
        Picture picture6 = new Picture(6,date4, "Barbara", OrderType.FAST, 2.6);

        photoStudio.addPicture(picture);
        photoStudio.addPicture(picture2);
        photoStudio.addPicture(picture3);
        photoStudio.addPicture(picture4);
        photoStudio.addPicture(picture5);
        photoStudio.addPicture(picture6);

        System.out.println("All pictures: ");
        photoStudio.showPictures();
        System.out.println();
        System.out.println("Order by date then by owner name: ");
        photoStudio.OrderByDateThenOwnerName();
        System.out.println();
        System.out.println("Display the picture that has the highest id: ");
        photoStudio.biggerID();
        System.out.println();
        System.out.println("Return the collection of pictures that are of the order type EXPRESS: ");
        photoStudio.pictureEXPRESS();
        System.out.println("\nDisplay pictures that are larger than 2MB in size: ");
        photoStudio.pictureMoreThan2MB();
        System.out.println("\nDisplay pictures: STANDARD, FAST and EXPRESS: ");
        photoStudio.sortByOrderType();

        LocalDate archiveDate = LocalDate.of(2023,10,5);
        LocalDate archiveDate2 = LocalDate.of(2023,10,1);

        photoStudio.addToArchive(picture, archiveDate);
        photoStudio.addToArchive(picture2, archiveDate2);
        photoStudio.addToArchive(picture3, archiveDate);
        photoStudio.addToArchive(picture4, archiveDate2);
        photoStudio.addToArchive(picture5, archiveDate2);
        photoStudio.addToArchive(picture6, archiveDate);

        System.out.println("\nDisplay archived pictures sorted by owner name.");
        photoStudio.displayPictureArchiveByOwnerName();
        System.out.println();
        photoStudio.displayPictureArchiveByOwnerNameContainingIvan();

    }
}

