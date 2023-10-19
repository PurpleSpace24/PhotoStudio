package Entity;

import java.util.*;

public class Factory implements Ffunc{

    private List<Sweets> sweetsList;
    private Set<Sweets> sweetsSet;
    private Queue<Sweets> prQueueSweets;

    public Factory() {
        this.sweetsList = new ArrayList<>();
        this.sweetsSet = new HashSet<>();
        this.prQueueSweets = new PriorityQueue<>();
    }

    public List<Sweets> getSweetsList() {
        return sweetsList;
    }

    public void setSweetsList(List<Sweets> sweetsList) {
        this.sweetsList = sweetsList;
    }

    public Set<Sweets> getSweetsSet() {
        return sweetsSet;
    }

    public void setSweetsSet(Set<Sweets> sweetsSet) {
        this.sweetsSet = sweetsSet;
    }

    public Queue<Sweets> getPrQueueSweets() {
        return prQueueSweets;
    }

    public void setPrQueueSweets(Queue<Sweets> prQueueSweets) {
        this.prQueueSweets = prQueueSweets;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "sweetsList=" + sweetsList +
                ", sweetsSet=" + sweetsSet +
                ", priorityQueueSweets=" + prQueueSweets +
                '}';
    }

    public void addSweets(Sweets sweets){
        sweetsList.add(sweets);
        //sweetsSet.add(sweets);
        //prQueueSweets.add(sweets);
    }

    public void displaySweets(){
        sweetsList.forEach(System.out::println);
    }

    public void displaySweetsByQuantityProduced(){
        this.sweetsList.stream().sorted(((sweets, sweets1) -> sweets1.getProducedQuantity().compareTo(sweets.getProducedQuantity()))).forEach(System.out::println);
    }

    public void displaySweetsByProductionDateAndName(){
        this.sweetsList.stream().sorted(Sweets.sweetsProductionDate.thenComparing(Sweets.sweetsName)).forEach(System.out::println);
    }

    public void displayChocolateSweets(){
        sweetsList.stream().filter(sweets -> sweets.getSweetsType().equals(SweetType.CHOCOLATE)).forEach(System.out::println);
    }

    // I
    public void displaySweetsQuantityGreaterThan(int quantity){
        sweetsList.stream().filter(sweets -> sweets.getProducedQuantity() > quantity).forEach(System.out::println);
    }

    // II
    public void displaySweetsQuantityGreaterThan2(){
        sweetsList.stream().filter(sweets -> sweets.getProducedQuantity() > 200).forEach(System.out::println);
    }

}
