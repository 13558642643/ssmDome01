package com.ssm.zxw.algorithm;

public class 二叉树 {
    public Node init(){
//        Node J = new Node(8, null, null);
//        Node H = new Node(4, null, null);
//        Node G = new Node(2, null, null);
//        Node F = new Node(7, null, J);
//        Node E = new Node(5, H, null);
//        Node D = new Node(1, null, G);
//        Node C = new Node(9, F, null);
//        Node B = new Node(3, D, E);
//        Node A = new Node(6, B, C);
        Node E = new Node(4, null, null);
        Node F = new Node(5, null, null);
        Node B = new Node(2, E, F);
        Node G = new Node(6, null, null);
        Node H = new Node(7, null, null);
        Node C = new Node(3, G, H);
        Node A = new Node(1, B, C);
        return A;   //返回根节点
    }

    /**
     * 前序
     */
    static int qianxu = 0;
    public void qianXu(Node node){
        qianxu++;
        System.out.print(node.getData());
        if(qianxu != 1){
            System.out.print("，");
        }

        if(node.getLeftNode() != null){
            qianXu(node.getLeftNode());
        }
        if(node.getRightNode() != null){
            qianXu(node.getRightNode());
        }
        qianxu--;
    }
    /**
     * 中序
     */
    public void zhongXu(Node node){

        if(node.getLeftNode() != null){
            zhongXu(node.getLeftNode());
        }
        System.out.print(node.getData()+"，");
        if(node.getRightNode() != null){
            zhongXu(node.getRightNode());
        }
    }

    /**
     *  后续
     */
    public void houXu(Node node){

        if(node.getLeftNode() != null){
            houXu(node.getLeftNode());
        }

        if(node.getRightNode() != null){
            houXu(node.getRightNode());
        }
        System.out.print(node.getData()+"，");
    }

    public static void main(String[] args) {
        二叉树 er = new 二叉树();
        Node node = er.init();
        er.qianXu(node);
        System.out.println();
        er.zhongXu(node);
        System.out.println();
        er.houXu(node);
    }
}
