//Give a N*M grid of characters 'O', 'X', and 'Y'. Find the minimum Manhattan distance between a X and a Y.

// Manhattan Distance :
// | row_index_x - row_index_y | + | column_index_x - column_index_y |

// User function Template for Java

class Solution {
    static int shortestXYDist(ArrayList<ArrayList<Character>> grid, int N,
                              int M) {
        // code here
        //store the coordinates of X and Ys 
        //Iterate through both and find the minimum 
        
        ArrayList<ArrayList<Integer>> x_cor = new ArrayList<>();
        ArrayList<ArrayList<Integer>> y_cor = new ArrayList<>();
        
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<M; j++)
            {
                if(grid.get(i).get(j)=='X')
                {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(i); //i cordinate
                    a.add(j); //j coordinate
                    x_cor.add(a);
                }
                
                if(grid.get(i).get(j)=='Y')
                {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(i); //i cordinate
                    a.add(j); //j coordinate
                    y_cor.add(a);
                }
            }
        }
        
        
        int min_d = Integer.MAX_VALUE;
        
        for(int i=0; i<x_cor.size(); i++)
        {
            int r_x = x_cor.get(i).get(0);
            int c_x = x_cor.get(i).get(1);
            for(int j=0; j<y_cor.size(); j++)
            {
                int r_y = y_cor.get(j).get(0);
                int c_y = y_cor.get(j).get(1);
                
                int manhattan_dis = Math.abs(r_x- r_y) + Math.abs(c_x- c_y);
                
                if(manhattan_dis< min_d)
                {
                    min_d = manhattan_dis;
                }
            }
        }
        
        return min_d;
        
    }
};
