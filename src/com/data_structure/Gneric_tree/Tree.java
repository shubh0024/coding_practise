package com.data_structure.Gneric_tree;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Tree {
    public static class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();

        Node(){

        }
        Node(int data){
            this.data=data;
        }
    }
 //display(10)-> 10 will print itself and its faamily
    
  public static void display(Node node){
        String str = node.data + "->"; //node ko print krane me saksham hai

        for( Node child: node.children){
            str+= child.data + ","; //next child ko print kradege

        }
        str+=".";
      System.out.println(str);

      for(Node child:node.children){
          display(child);
      }
  }



  public static int size(Node node){
        int s=0; //size increased as loop run

        for (Node child : node.children){
            int cs = size(child);
            s= s+ cs;

        }
        s=s + 1;

        return s;


  }

  public static int max(Node node){
        int max = Integer.MIN_VALUE; //set the Integer value to be -infinity

        for(Node child: node.children){
            int cm = max(child);
            max= Math.max(cm,max); //comparision and value inserted to max
        }
        max = Math.max(node.data,max);

        return max;
  }

    //note :- for the checking the height for in the term of the node take height =0;
  public static int height(Node node){
        int ht=-1; //it is taken due to the for the edges

      for(Node child:node.children){
          int ch=height(child);
          ht=Math.max(ch,ht);

      }
      ht+=1;

      return ht;


  }


  public static void traversals(Node node){
        //pre area 1
      System.out.println("Node pre"+node.data);

      for(Node child:node.children){
          System.out.println("edges pre"+node.data +"-->"+ child.data);
          traversals(child);
          System.out.println("edges post"+node.data + " -->"+ child.data);
      }
      System.out.println("Node post "+ node.data); //euler right
  }

  //level order traversal

    public static void levelordertraversl(Node node){
        Queue<Node> q= new ArrayDeque<>();
        q.add(node);

        while(q.size()>0){
            node=q.remove();
            System.out.println(node.data+" ");
            for(Node child:node.children){
                q.add(child);
            }

        }
        System.out.println(".");
    }


    //level order traversals

    public static  void levelOrderlinewise2(Node node){
        Queue<Node> mq = new ArrayDeque<>();

        mq.add(node);
        mq.add(new Node(-1));
        while(mq.size()>0) {
            mq.remove();

            if (node.data != -1) {
                System.out.println(node.data);

                for(Node child:node.children){
                    mq.add(child);
                }
                }else{

                if(mq.size()>0){
                    mq.add(new Node(-1));
                    System.out.println();
                }
            }
        }

    }

    //level order traversal linewise

    public static void levelorderwise(Node node){
        Queue<Node> mq=new ArrayDeque<>();
        mq.add(node);
        Queue<Node> cq= new ArrayDeque<>();

        while(mq.size()>0){
            mq.remove();
            System.out.println(node.data+"");

            for(Node child:node.children){
                cq.add(child);
            }

            if(mq.size()==0){
                mq=cq;
                cq=new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    //levelorder by left to right to left (zig-zag) traversal
    //keep remember that which type you are crossing level odd or even

    public static void levelorderzigzag(Node node){
        Stack<Node> ms=new Stack<>();
        ms.push(node);
        int level=1;
        Stack<Node> cs=new Stack<>();
        while(ms.size()>0){
            ms.pop();

            System.out.println(node.data+"");
            if(level%2==1){
                for(int i=0; i<node.children.size(); i++){
                    Node child=node.children.get(i); //for accessing the element at i
                    cs.push(child); //pushing all in the child stack
                }
            }else{
                for(int i=node.children.size()-1; i>=0; i--){
                    Node child= node.children.get(i);
                    cs.push(child);
                }
            }

            if(ms.size()==0){
                ms=cs;
                cs=new Stack<>();
                level++;
                System.out.println();
            }
        }
    }

    private static class pair{
        Node node;
        int level;

        pair(Node node ,int level){
       this.node=node;
            this.level=level;
        }
    }

    public static void levelorderlevelwise4(Node node){
        Queue<pair> mq=new ArrayDeque<>();

        mq.add(new pair(node,1));

        int level=1;

        while(mq.size()>1){
            pair p=mq.remove();
            if(p.level > level){
                level=p.level;
                System.out.println();
            }
            System.out.println(p.node.data+"");

            for(Node child :p.node.children){
                pair cp=new pair(child,p.level+1);
                mq.add(cp);
            }
            System.out.println(node.data+" ");
        }



    }

//linearnrise o(n)

    public static Node linearize(Node node){
        if(node.children.size()==0){
            return node;
        }

        Node lkt=linearize(node.children.get(node.children.size()-1));

        while(node.children.size()>1){
            Node last= node.children.remove(node.children.size()-1);
            Node sl=node.children.get(node.children.size()-1);
            Node slkt=linearize(sl);
            slkt.children.add(last);
        }
        return lkt;
    }


    //find the element in the tree

    public static boolean find(Node node, int data){
        if(node.data==data){
            return true;
        }
        for(Node child:node.children){
            boolean fic= find(child,data);
            if(fic){
                return  true;
            }

        }
        return false;
    }

static  int size;
    static int min;
    static int max;
    static int height;
public static void multisolver(Node node,int depth){

        size++;

        min= Math.min(min,node.data);
        max=Math.min(min,node.data);

        height=Math.max(height,depth);

        for(Node child:node.children){
            multisolver(node,depth+1);

        }


}


public static int dia=0;
static int calculateReturnheight(Node node){
    int dch=-1; //depth child height
    int sch=-1; //second height child

    for(Node child:node.children){
        int ch=calculateReturnheight(child);

        if(ch>dch){
            sch=ch;
            dch=ch;

        }else if(ch>sch){
           sch=ch;
        }
        int cn=dch+sch+2;
        if(cn> dia){

        dia=dch+sch+2;

        }
        dch+=1;

    }
    return dch;
}

//iterative Preorder and post order
    static class Pair{
    Node node;
    int state;

    Pair(Node node,int state){
        this.node=node;
        this.state=state;
    }
}

public static void InterativePreandPostorder(Node node){
    Stack<Pair> st=new Stack<>();
    st.push(new Pair(node,-1));

    while(st.size()>0){
        Pair top=st.peek();
    }
}


    public static void main(String[] args) {


        int[] arr= {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root=null;
        Stack<Node> st = new Stack<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]== -1){
                st.pop();
            }else {
                Node t = new Node();
                t.data = arr[i];


                if (st.size() > 0) {
                    st.peek().children.add(t);

                }else{
                    root=t;
                }
                st.push(t);
            }
        }

//        System.out.println(max(root)); //node will be printed max

//        System.out.println(height(root)); //it will print the height of  the tree

//        traversals(root);
//        levelordertraversl(root);
//
//        levelorderlevelwise4(root);
//        levelorderzigzag(root);
//        linearize(root);
//        display(root);
//        System.out.println(find(root,10));//return the true for

//size=0;
//        min=Integer.MIN_VALUE;
//        max= Integer.MAX_VALUE;
//        height=0;
//        multisolver(root,70);
//        System.out.println("size"+size);
//        System.out.println("min"+min);
//        System.out.println("max"+max);
//        System.out.println("height"+height);
//
//        //diameter of the generic Tree
//
        calculateReturnheight(root);

        System.out.println(dia+" \t"+"diameter");


    }

}
