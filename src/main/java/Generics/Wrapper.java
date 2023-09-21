package Generics;

public class Wrapper <T, E> implements SingleWrapper<Integer>{

    Wrapper<Integer, String> storeInt = new Wrapper<>();
    //Wrapper<String> storeString = new Wrapper<>();


    public Wrapper<Integer, String> getStoreInt() {
        return storeInt;
    }

    public void setStoreInt(Wrapper<Integer, String> storeInt) {
        this.storeInt = storeInt;
    }

    @Override
    public Integer getT(Integer data) {
        return null;
    }

    @Override
    public void add(Integer data) {

    }
}
