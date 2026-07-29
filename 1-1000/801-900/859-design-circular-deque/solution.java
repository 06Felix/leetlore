class MyCircularDeque {
  public MyCircularDeque(int k) {
    this.k = k;
    this.q = new int[k];
    this.rear = k - 1;
  }
  public boolean insertFront(int value) {
    if (isFull())
      return false;

    front = (--front + k) % k;
    q[front] = value;
    ++size;
    return true;
  }
  public boolean insertLast(int value) {
    if (isFull())
      return false;

    rear = ++rear % k;
    q[rear] = value;
    ++size;
    return true;
  }
  public boolean deleteFront() {
    if (isEmpty())
      return false;

    front = ++front % k;
    --size;
    return true;
  }
  public boolean deleteLast() {
    if (isEmpty())
      return false;

    rear = (--rear + k) % k;
    --size;
    return true;
  }
  public int getFront() {
    return isEmpty() ? -1 : q[front];
  }

  public int getRear() {
    return isEmpty() ? -1 : q[rear];
  }

  public boolean isEmpty() {
    return size == 0;
  }
  
  public boolean isFull() {
    return size == k;
  }

  private final int k;
  private int[] q;
  private int size = 0;
  private int front = 0;
  private int rear;
}
