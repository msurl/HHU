public class Bin_Suchbaum {
    public int countNodes(BinNode bn) {
        if ((bn.left == null) && (bn.right == null)) {
            return 1;
        }

        if ((bn.left != null) && (bn.right != null)) {
            return countNodes(bn.right) + 1 + countNodes(bn.left);
        }

        if (bn.left != null) {
            return countNodes(bn.left) + 1;
        } else {
            return countNodes(bn.right) + 1;
        }
    }

    public class BinNode {
        public int     element;
        public BinNode left, right;
    }


    public class BinTree {
        public BinNode root;

        public int count() {
            if (head == null) {
                return 0;
            }

            return countNodes(root);
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
