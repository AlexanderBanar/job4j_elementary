package ru.job4j.poly;

public class FileStore extends DbStore {
    @Override
    public void save(String value) {
        super.save(value);
    }

    @Override
    public String[] load() {
        return super.load();
    }

    public static void main(String[] args) {
        DbStore store = new FileStore();
        Service service = new Service(store);
        service.extract();
    }
}
