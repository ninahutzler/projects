package zoo;

public class Zoo {

    public static void main (String[] args){
        Whale whale = new Whale();
        whale.setSize(7);

        System.out.println("Here is the size of the whale: " + whale.getSize() );
    }
}
