class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer>  n = new Stack<>();
		n.push(s.pop());
		
		while(!s.isEmpty())
		{
		    if(n.isEmpty() || n.peek()<=s.peek())
		    {
		        n.push(s.pop());
		    }
		    else
		    {
		        int temp = s.peek();
		        s.pop();
		        while(!n.isEmpty() && n.peek()>temp)
		        {
		            s.push(n.pop());
		        }
		        
		        n.push(temp);
		    }
		}
		
		return n;
		
	}
}
