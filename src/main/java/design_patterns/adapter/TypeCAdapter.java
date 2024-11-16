package design_patterns.adapter;

//Компьютер может читать информацию только с USB, нужно прочитать через usb адаптер информацию с карты памяти.
// (создаю карту, адаптер и с компьютера читаю)
public class TypeCAdapter implements IUsb {

    private final TypeCMemoryCard typeCMemoryCard;

    public TypeCAdapter(TypeCMemoryCard typeCMemoryCard){
        this.typeCMemoryCard = typeCMemoryCard;
    }

    @Override
    public void connect() {
        typeCMemoryCard.connect();
    }
}
