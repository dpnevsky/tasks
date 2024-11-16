package design_patterns.adapter;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer();
        TypeCMemoryCard memoryCard = new TypeCMemoryCard();
        TypeCAdapter typeCAdapter = new TypeCAdapter(memoryCard);
        computer.readData(typeCAdapter);
    }
}

/*result:

MemoryCard is connected.
Reading data from memory card.

 */
