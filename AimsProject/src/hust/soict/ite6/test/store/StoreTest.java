package hust.soict.ite6.test.store;

import hust.soict.ite6.aims.disc.DigitalVideoDisc;
import hust.soict.ite6.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f);

        // Thêm DVD vào cửa hàng
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // In ra danh sách DVD trong cửa hàng
        store.printStore();

        // Xóa một DVD khỏi cửa hàng
        store.removeDVD(dvd2);

        // In lại danh sách DVD trong cửa hàng
        store.printStore();

        // Thử xóa một DVD không tồn tại
        store.removeDVD(dvd2);
    }
}
