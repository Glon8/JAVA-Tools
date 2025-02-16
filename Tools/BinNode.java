package Tools;

import java.util.Arrays;

public class BinNode<T> {
    private T value;
    private BinNode<T> left;
    private BinNode<T> right;

    public BinNode(T value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public BinNode(T value, BinNode<T> left, BinNode<T> right) {
        this.value = value;
        this.left =  left;
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean hasLeft() {
        return this.left != null;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public boolean hasRight() {
        return this.right != null;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }

    public BinNode<T> getRight() {
        return right;
    }

    //============================================\/
    public int length(){
        int count = 1;

        count += this.left != null? this.left.length() : 0;

        count += this.right != null? this.right.length() : 0;

        return count;
    }

    public int depth(){
        return Math.max(rootLevelCount(this.left, 1),rootLevelCount(this.right, 1));
    }

    private int rootLevelCount(BinNode<T> bNode, int depth){
        if(bNode == null) return 0;

        int cur = depth;

        depth++;

        return Math.max(cur, Math.max(rootLevelCount(bNode.getLeft(), depth), rootLevelCount(bNode.getRight(), depth)));
    }

    public int offspringsCount(){
        if(this.left == null && this.right == null) return 1;

        return this.left.offspringsCount() + this.right.offspringsCount();
    }

    public boolean contains(T i){
        boolean flag = false;

        if(this.value == i) return true;

        if(this.left != null) flag = this.left.contains(i);
        if(this.right != null) flag = this.right.contains(i);

        return flag;
    }

    public void print(){
        int rootLength = Math.max(rootLevelCount(this.left, 1),rootLevelCount(this.right, 1)) + 1;
        int rootWidth = 7 * (int)(Math.pow(2,rootLength) + 1);
        int topRoot = rootWidth / 2;

        String[] treeRoots = new String[rootLength];

        for(int i = 0; i < rootLength; i++){
            treeRoots[i] = "";

            for(int g = 0; g < (7 * (rootLength - i)); g++){
                treeRoots[i] += "\t";
            }
        }

        getPoOrdAdj(this.left, treeRoots, 0);

        for(int i = 0; i < topRoot; i++) treeRoots[0] += "";

        treeRoots[0] += this.value;

        getPoOrdAdj(this.right, treeRoots, 0);

        System.out.println("Print Root Diagram:");

        for(int i = 0; i < treeRoots.length; i++) System.out.println(treeRoots[i]);
    }

    private void getPoOrdAdj(BinNode<T> bNode, String[] str, int depth){
        if(bNode == null) return;

        depth++;

        str[depth] += bNode.value;

        for(int g = 0; g < (7 * (str.length - depth) + 5); g++){
            str[depth] += " \t";
        }

        getPoOrdAdj(bNode.left, str, depth);
        getPoOrdAdj(bNode.right, str, depth);
    }

    public void printPreOrder(){
        System.out.print(this.value + " ");

        printPreOrderRoot(this.left);
        printPreOrderRoot(this.right);
    }

    private void printPreOrderRoot(BinNode<T> bNode){
        if(bNode == null) return;

        System.out.print(bNode.getValue() + " ");

        printPreOrderRoot(bNode.getLeft());
        printPreOrderRoot(bNode.getRight());
    }

    public void printInOrder(){
        printInOrderRoot(this.left);

        System.out.print(this.value + " ");

        printInOrderRoot(this.right);
    }

    private void printInOrderRoot(BinNode<T> bNode){
        if(bNode == null) return;

        printInOrderRoot(bNode.getLeft());

        System.out.print(bNode.getValue());

        printInOrderRoot(bNode.getRight());
    }

    public void printPostOrder(){
        printPostOrderRoot(this.left);
        printPostOrderRoot(this.right);

        System.out.print(this.value + " ");
    }

    private void printPostOrderRoot(BinNode<T> bNode){
        if(bNode == null) return;

        printPostOrderRoot(bNode.getLeft());
        printPostOrderRoot(bNode.getRight());

        System.out.print(bNode.getValue() + " ");
    }

    private void getPoOrdAdjNumeric(BinNode<T> bNode, String[] str, int deepth , T prev){
        if(bNode == null) return;

        T par = prev;

        prev = bNode.getValue();

        deepth++;

        str[deepth] += par + "> " + bNode.value + "   ";

        getPoOrdAdjNumeric(bNode.left, str, deepth, prev);
        getPoOrdAdjNumeric(bNode.right, str, deepth, prev);
    }

    //============================================/\
    @Override
    public String toString(){
        int rootLength = Math.max(rootLevelCount(this.left, 1),rootLevelCount(this.right, 1)) + 1;

        String[] treeRoots = new String[rootLength];

        Arrays.fill(treeRoots, "");

        treeRoots[0] = "Numeric Root Diagram:\r\n0> " + this.value;

        getPoOrdAdjNumeric(this.left, treeRoots, 0, this.value);

        getPoOrdAdjNumeric(this.right, treeRoots, 0, this.value);

        for(int i = 1; i < treeRoots.length; i++) treeRoots[0] += "\r\n" + treeRoots[i];

        return treeRoots[0] + "\r\n";
    }
}
