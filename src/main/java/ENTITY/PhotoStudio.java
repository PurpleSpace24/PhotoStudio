package ENTITY;

import java.time.LocalDate;
import java.util.*;

public class PhotoStudio implements SP {

    private List<Picture> pictures;
    private Map<Picture, LocalDate> picturesArchive;

    public PhotoStudio() {
        this.pictures = new ArrayList<>();
        this.picturesArchive = new HashMap<Picture, LocalDate>();
    }

    public Map<Picture, LocalDate> getPicturesArchive() {
        return picturesArchive;
    }

    public void setPicturesArchive(Map<Picture, LocalDate> picturesArchive) {
        this.picturesArchive = picturesArchive;
    }

    // Add pictures
    public void addPicture(Picture picture){
        if(!pictures.contains(picture)){
            pictures.add(picture);
        }
    }

    // Display pictures
    public void showPictures() {
        if (pictures.isEmpty()) {
            System.out.println("There is no pictures!");
        }else {
            pictures.stream().sorted(Picture.pictureByID).forEach(System.out::println);
        }
    }

    // Display pictures sorted by creation date and then owner name.
    public void OrderByDateThenOwnerName() {
        if (pictures.isEmpty()) {
            System.out.println("There is no pictures!");
        }else {
            pictures.stream().sorted(Picture.pictureByDate.thenComparing(Picture.pictureByName)).forEach(System.out::println);
        }
    }

    // Display the pictures that has the highest id.
    public void biggerID() {
        if (pictures.isEmpty()) {
            System.out.println("There is no pictures!");
        }else {
            Picture largestIdPhoto = pictures.get(0);
            for (Picture photo : pictures) {
                if (photo.getId() > largestIdPhoto.getId()) {
                    largestIdPhoto = photo;
                }
            }
            System.out.println(largestIdPhoto);
        }
    }

    // Return the collection of pictures that are of the order type EXPRESS
    public void pictureEXPRESS() {
        if (pictures.isEmpty()) {
            System.out.println("There is no pictures!");
        }else{
            this.pictures.stream().filter(picture -> picture.getOrder_type().equals(OrderType.EXPRESS)).forEach(System.out::println);
        }
    }

    // Display pictures that are larger than 2MB in size
    public void pictureMoreThan2MB() {
        if (pictures.isEmpty()) {
            System.out.println("There is no pictures!");
        }else {
            this.pictures.stream().filter(picture1 -> picture1.getFile_size() > 2.0).forEach(System.out::println);
        }
    }

    public void sortByOrderType(){
        if (pictures.isEmpty()) {
            System.out.println("There is no pictures!");
        }else {
            pictures.stream().sorted(Picture.pictureByOrder).forEach(System.out::println);
        }
    }

    // ---------------

    public void addToArchive(Picture picture, LocalDate archiveDate){
        if (!picturesArchive.containsKey(picture)){
            picturesArchive.put(picture, archiveDate);
        }else{
            System.out.println("This picture already exists!");
        }
    }

    public void displayPictureArchiveByOwnerName(){
        List<Picture> sortedArchivedPhotos = new ArrayList<>(picturesArchive.keySet());
        sortedArchivedPhotos.stream().sorted(Comparator.comparing(Picture::getOwner_name)).forEach(picture -> {
            LocalDate archiveDate = picturesArchive.get(picture);
            System.out.println("Archived: " + picture.getOwner_name() + ", " + archiveDate);
        });
    }

    public void displayPictureArchiveByOwnerNameContainingIvan() {
        List<Picture> archivedPictures = new ArrayList<>(picturesArchive.keySet());
        boolean anyIvanPhotosExist = archivedPictures.stream().anyMatch(picture -> picture.getOwner_name().contains("Ivan"));

        if (anyIvanPhotosExist) {
            archivedPictures.stream()
                    .filter(picture -> picture.getOwner_name().contains("Ivan"))
                    .forEach(picture -> {
                        LocalDate archiveDate = picturesArchive.get(picture);
                        System.out.println("Archived: " + picture.getOwner_name() + ", " + archiveDate);
                    });
        } else {
            System.out.println("No archived photos with an owner name containing 'Ivan'!");
        }
    }
}
