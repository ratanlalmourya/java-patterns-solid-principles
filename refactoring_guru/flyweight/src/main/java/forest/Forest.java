package forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;

import trees.Tree;
import trees.TreeFactory;
import trees.TreeType;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x,int y,String name, Color color,String otherTreeData) {
        TreeType  type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x,y,type);
        trees.add(tree);
    }

    


    
}
