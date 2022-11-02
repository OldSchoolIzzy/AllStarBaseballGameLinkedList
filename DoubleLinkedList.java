public class DoubleLinkedList {
    Player head = null;
    Player tail = null;

    public void addNode(String name, double avg, double hrPerc){
        Player player = new Player(name, avg, hrPerc);

        if (head == null){
            // it is the first node
            head = player;
            tail = player;
            head.previous = null;
            tail.next = null;
        }else {
            tail.next = player;
            player.previous = tail;
            tail = player;
            tail.next = null;
        }
    }

    public void printNodes(){
        Player current = head;
        if (head == null){
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Players of doubly linked list");
        while (current != null){
            System.out.println("PLayer name: " + current.getName() + " Player batting average: " + current.getBattingAVG()
            + " Player home run percentage: " + current.getHomeRunPercentage());
            current = current.next;
        }
    }
}
