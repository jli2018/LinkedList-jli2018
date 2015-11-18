
public class LinkedList<E>
{
	private ListNode<E> head;
	private ListNode<E> tail;
	private int size;

	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}

	public int size()
	{
		int count = 0;
		for ( ListNode<E> curr = head; curr != null; curr = curr.getNext() )
		{
			count++;
		}

		return count;
	}

	public int getSize()
	{
		return size(head);
	}

	private int size( ListNode<E> node )
	{
		if ( node == null )
			return 0;
		else
			return 1 + size( node.getNext() );
	}

	//good for the future, when we might need to have boolean for sets
	public boolean add( E e )
	{
		/*ListNode<E> ln = new ListNode<E>( e );
		tail.setNext( ln ); 
		tail = ln;

		size++;*/

		add( size, e);
		return true;
	}

	public void add( int index, E e )
	{
		//what if index = size??? adding to the end? should that be taken care of here?

		ListNode<E> node = new ListNode<E>( e );
		//if ( index <= size/2 +1)
		//{
			ListNode<E> ln = head; 
			for ( int i = 0; i < index-1; i++)
			{
				ln = ln.getNext(); 
			}
			node.setNext( ln.getNext() );
			ln.setNext( node );

		//}


		/*if ( index > size/2 )
		{
			ListNode<E> ln = tail; 
			for ( int i = size-1; i < ; i--)
			{
				//ln = ln.getPrev(); 				//wait we can't do this!?
			}
		}*/

		size++;
	}

	public E get( int index )
	{
		ListNode<E> ln = head; 
		for ( int i = 0; i < index; i++)
		{
			ln = ln.getNext(); 
		}
		return (E) ln;
	}

	




	public String toString()
	{
		String toReturn = "";
		ListNode<E> ln = head;
		//if i added the first toString() here, i would not need the last iteration of the loop
		toReturn += ln.toString();
		for ( int i = 0; i < size-1; i++ )
		{
			ln = ln.getNext();
			toReturn += " ---> " + ln.toString();

		}
		return toReturn;
	}

	public static void main( String[] args )
	{
		LinkedList<String> list = new LinkedList<String>();
		//ListNode<String> ln1 = new ListNode<String>( "item1" );
		//ListNode<String> ln2 = new ListNode<String>( "item2" );
		list.add( "item1" );
		list.add( "item2" );


	}


}



/*

singly - with head pointer and tail pointer
doubly - points forward and backward

*/
