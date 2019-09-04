package zx.learn.解释器;

public class DivNode extends SymbolNode{
    public DivNode(Node left,Node right){
        super(left,right);
    }

    public int interpret(){
        return super.left.interpret() / super.right.interpret();
    }
}