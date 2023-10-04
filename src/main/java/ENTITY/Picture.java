package ENTITY;

import java.time.LocalDate;
import java.util.Comparator;

public class Picture {
    private long id;
    private LocalDate date_created;
    private String owner_name;
    private Order order_type;
    private double file_size;

    public Picture(long id, LocalDate date_created, String owner_name, Order order_type, double file_size) {
        this.id = id;
        this.date_created = date_created;
        this.owner_name = owner_name;
        this.order_type = order_type;
        this.file_size = file_size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDate date_created) {
        this.date_created = date_created;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public Order getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Order order_type) {
        this.order_type = order_type;
    }

    public double getFile_size() {
        return file_size;
    }

    public void setFile_size(double file_size) {
        this.file_size = file_size;
    }

    public static Comparator<Picture> pictureByDate = new Comparator<Picture>() {
        @Override
        public int compare(Picture picture, Picture picture1) {
            return picture.getDate_created().compareTo(picture1.getDate_created());
        }
    };

    public static Comparator<Picture> pictureByName = new Comparator<Picture>() {
        @Override
        public int compare(Picture picture, Picture picture1) {
            return picture.getOwner_name().compareTo(picture1.getOwner_name());
        }
    };

    public static Comparator<Picture> pictureByID = new Comparator<Picture>() {
        @Override
        public int compare(Picture picture, Picture picture1) {
            return Long.compare(picture.getId(),(picture1.getId()));
        }
    };

    public static Comparator<Picture> pictureByOrder = new Comparator<Picture>() {
        @Override
        public int compare(Picture picture, Picture picture1) {
            return picture.getOrder_type().compareTo(picture1.getOrder_type());
        }
    };


    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", date_created=" + date_created +
                ", owner_name='" + owner_name + '\'' +
                ", order_type=" + order_type +
                ", file_size=" + file_size +
                '}';
    }
}
