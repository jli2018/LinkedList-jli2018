

public class ListNode<E>
{
	private E item;
	private ListNode<E> next;


	public ListNode( E it )
	{
		item = it; 
		//should i set next to null?
		next = null;
	}

	public ListNode( E it, ListNode<E> nxt )
	{
		item = it; 
		next = nxt; 
	}

	public E getItem()
	{
		return item;
	}

	public ListNode getNext()
	{
		return next;
	}

	public void setItem( E e )
	{
		item = e; 
	}

	public void setNext( ListNode<E> ln )
	{
		next = ln; 
	}

	public String toString()
	{
		return item.toString(); 
	}

}
