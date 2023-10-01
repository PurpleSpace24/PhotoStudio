package ENTITY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PhotoStudio implements SP {

    private List<Picture> pictures;

    public PhotoStudio() {
        this.pictures = new ArrayList<>();;
    }

    public void addPicture(Picture picture){
        pictures.add(picture);
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    @Override
    public void showPictures() {
        Collections.sort(pictures, Comparator.comparingLong(Picture::getId));

        for (Picture picture : pictures) {
            System.out.println(picture);
        }
    }
}
