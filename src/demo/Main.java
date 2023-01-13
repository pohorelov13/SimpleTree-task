package demo;

public class Main {
    public static void main(String[] args) {
        SimpleTree<Integer> myTree = new SimpleTree<>();

        myTree.add(13);
        myTree.add(5);
        myTree.add(14);
        myTree.add(52);
        myTree.add(100);
        myTree.add(67);
        myTree.add(8);
        myTree.add(5);
        myTree.add(4);
        myTree.add(6);

        for (int i :
                myTree) {
            System.out.println(i);
        }

    }
}