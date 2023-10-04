package ENTITY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhotoStudio implements SP {

    private List<Picture> pictures;

    public PhotoStudio() {
        this.pictures = new ArrayList<>();
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    // Add pictures
    public void addPicture(Picture picture){
        pictures.add(picture);
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
            this.pictures.stream().filter(picture -> picture.getOrder_type().equals(Order.EXPRESS)).forEach(System.out::println);
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
}
