package design_patterns.adapter;

public class TypeCMemoryCard implements ITypeC {

    @Override
    public void connect() {
        System.out.println("MemoryCard is connected.");
    }
}
