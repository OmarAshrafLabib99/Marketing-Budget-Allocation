public class Pair<L,R>
{

    private L left;
    private R right;

    public void setLeft(L l)
    {
        this.left = l;
    }
    public void setRight(R r)
    {
        this.right = r;
    }

    public L getLeft() { return left; }
    public R getRight() { return right; }

    @Override
    public int hashCode() { return left.hashCode() ^ right.hashCode(); }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Pair)) return false;
        Pair pairo = (Pair) o;
        return this.left.equals(pairo.getLeft()) &&
                this.right.equals(pairo.getRight());
    }

}