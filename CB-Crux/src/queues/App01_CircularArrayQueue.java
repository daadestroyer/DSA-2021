package queues;

public class App01_CircularArrayQueue {
	private int[] array;
	private int currentsize;
	private int maxsize;
	private int front;
	private int rear;
	public static final int DEFAULT_CAPACITY = 10;

	public App01_CircularArrayQueue() {
		this(DEFAULT_CAPACITY);
	}

	public App01_CircularArrayQueue(int size) {
		this.array = new int[size];
		this.currentsize = 0;
		this.maxsize = size;
		this.front = 0;
		this.rear = size - 1;
	}

	public boolean isFull() {
		return this.currentsize == this.maxsize;
	}

	public boolean isEmpty() {
		return this.currentsize == 0;
	}

	public void enqueue(int data) {
		if (!this.isFull()) {
			// first point the rear index at 0 position
			this.rear = (this.rear + 1) % this.array.length;
			this.array[this.rear] = data;
			this.currentsize = this.currentsize + 1;
		} else {
			System.out.println("Queue is not empty");
		}
	}

	public int getFront() {
		return this.array[this.front];
	}

	public void dequeue() {
		if (!this.isEmpty()) {
			this.front = (this.front + 1) % this.array.length;
			this.currentsize = this.currentsize - 1;
		}
	}

	public void display() {
		if (!this.isEmpty()) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
		} else {
			System.out.println("Queue is empty");
		}
	}

	public static void main(String[] args) {
		int size = 5;
		App01_CircularArrayQueue queue = new App01_CircularArrayQueue(size);

		for (int i = 1; i <= size; i++) {
			queue.enqueue(i * 10);
		}
		queue.display();

		System.out.println();

		queue.dequeue();
		queue.dequeue();

		while (!queue.isEmpty()) {
			System.out.print(queue.getFront() + " ");
			queue.dequeue();

		}

	}
}
