package hust.soict.ite6.aims.store;

import hust.soict.ite6.aims.disc.DigitalVideoDisc;

public class Store {
    private static final int MAX_ITEMS = 50;
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[MAX_ITEMS];
    private int qtyInStore = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyInStore < MAX_ITEMS) {
            itemsInStore[qtyInStore] = disc;
            qtyInStore++;
            System.out.println("The DVD has been added: " + disc.getTitle());
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }
    
    public void removeDVD(DigitalVideoDisc disc) {
        boolean found = false;
        for (int i = 0; i < qtyInStore; i++) {
            if (itemsInStore[i] == disc) {
                for (int j = i; j < qtyInStore - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[qtyInStore - 1] = null;
                qtyInStore--;
                System.out.println("The DVD has been removed: " + disc.getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("The DVD is not found in the store.");
        }
    }

    public void printStore() {
        System.out.println("***********************STORE***********************");
        System.out.println("Available DVDs in the store:");
        for (int i = 0; i < qtyInStore; i++) {
            System.out.println((i + 1) + ". " + itemsInStore[i].toString());
        }
        System.out.println("***************************************************");
    }
}
