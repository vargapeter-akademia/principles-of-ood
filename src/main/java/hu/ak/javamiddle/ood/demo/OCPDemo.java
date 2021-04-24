package hu.ak.javamiddle.ood.demo;

public class OCPDemo {

    interface Node {
        void accept(Visitor visitor);
    }

    static class NodeA implements Node {
        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    static class NodeB implements Node {
        @Override
        public void accept(Visitor visitor) {
            visitor.visit(this);
        }
    }

    interface Visitor {
        void visit(NodeA a);
        void visit(NodeB b);
    }

    static class DemoVisitor implements Visitor {

        @Override
        public void visit(NodeA a) {
            System.out.println("Visiting A");
        }

        @Override
        public void visit(NodeB b) {
            System.out.println("Visiting B");
        }
    }

    public static void main(String[] args) {
        NodeA nodeA = new NodeA();
        NodeB nodeB = new NodeB();

        DemoVisitor visitor = new DemoVisitor();
        nodeA.accept(visitor);
        nodeB.accept(visitor);

    }

}
