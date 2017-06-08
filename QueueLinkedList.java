public class QueueLinkedList{
	QNode front, rear;

	public QueueLinkedList(){
		this.front = this.rear = null;
	}

	//Method to add a key to the queue 
	public void enqueue(int key){
		//Create a new Linked List Node
		QNode temp = new QNode(key);

		//If there is no node in the list, the new node is both front and rear
		if(this.rear == null){			
			this.front = this.rear = temp;
			return;
		}

		//Add the node to the end of the queue and change rear 
		this.rear.next = temp;
		this.rear = temp;
	}

	//Method to delete a key in the queue
	public QNode dequeue(){
		//If the queue is empty return null
		
		if(front == null){
			return null;
		}

		//Store the previous front and move front one node ahead
		QNode temp = this.front;
		this.front = temp.next;

		//If front becomes NULL, then change rear to NULL also
		if(this.front == null){
			this.rear = null;
		}
		return temp;
	}
}