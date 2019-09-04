package zx.learn.解释器;

public class MulNode extends SymbolNode
{
    public MulNode(Node left,Node right)
    {
        super(left,right);
    }

    public int interpret()
    {
        return left.interpret() * right.interpret();
    }
}