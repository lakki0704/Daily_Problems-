// Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
// 1. The amount of petrol that every petrol pump has.
// 2. Distance from that petrol pump to the next petrol pump.
// Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
// Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.


// In java function tour() takes two arguments array of petrol
// and array of distance

class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
	// Your code here	
	
	int i=0;
	int start = i;
	int d =0; //distance
	int diff =0;
	
	while(i<petrol.length)
	{
	   d += petrol[i]-distance[i];
	   if(d<0)
	   {
	       start=i+1;
	       diff +=d;
	       d=0;
	   }
	   
	   i++;
	}
	  
	  if(d+diff>=0)
	  {
	      return start;
	  }
	  
	  return -1;
	
	
    }
}
