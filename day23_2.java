/*Complete the function below*/
class GfG
{
           public static int findEquilibrium(int arr[], int n)
              {
                //add code here.
                int x =-1;
                
                int[] left = new int[n];
                int[] right = new int[n];
                
                left[0] = arr[0];
                for(int i=1; i<n; i++)
                {
                    left[i] = left[i-1] + arr[i];
                }
                
                right[0] = arr[n-1];
                for(int i=n-2,j=1; i>=0; i--,j++)
                {
                    right[j] = right[j-1]+ arr[i];
                }
                
                for(int i=1; i<n-1; i++)
                {
                    if(left[i-1]==right[n-2-i])
                    {
                        x=i;
                    }
                }
                
                return x;
              }
}
