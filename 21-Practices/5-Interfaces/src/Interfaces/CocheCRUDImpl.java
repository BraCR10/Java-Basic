package Interfaces;

public class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("1-Save");
    }

    @Override
    public void findAll() {
        System.out.println("\n2-findAll");
    }

    @Override
    public void delete() {
        System.out.println("\n3-Delete");
    }
}
