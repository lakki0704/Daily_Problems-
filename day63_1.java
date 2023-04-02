class GFG

{

    //Function to store the zig zag order traversal of tree in a list.

 public ArrayList<Integer> zigZagTraversal(Node root)

 {

     //Add your code here.

     ArrayList<Integer>ans = new ArrayList<>();

     Queue<Node>q = new LinkedList<>();

     q.add(root);

     boolean lefttoright = true;

     

     while(q.size() > 0){

         ArrayList<Integer>l = new ArrayList<>();

         int size = q.size();

         

         for(int i=0; i<size; i++){

             Node cur = q.poll();

             l.add(cur.data);

             if(cur.left != null) q.add(cur.left);

             if(cur.right != null) q.add(cur.right);

         }

         

         if(!lefttoright){

             Collections.reverse(l);

             ans.addAll(l);

         } else {

             ans.addAll(l);

         }

         lefttoright = !lefttoright;

     }

     return ans;

 }

}
