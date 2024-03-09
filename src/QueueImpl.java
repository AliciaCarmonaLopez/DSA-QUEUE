import java.util.Arrays;

public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;
    public QueueImpl(int length){
        Arrays.stream(data).limit(length);
    }
    public void push(E element) throws FullQueueException {
        int i = 0;
        Boolean encontrado = false;
        while(i<this.data.length && !encontrado){
            if(this.data[i] == null){
                encontrado = true;
            }
            if(!encontrado)
                i++;
        }
        if(!encontrado){
           this.data[i] = element;
        }
        else{
            throw new FullQueueException();
        }
    }
    public E pop() throws EmptyQueueException {
        E element = this.data[0];
        if(element == null){
            throw new EmptyQueueException();
        }
        else{
            if(this.data[1] != null){
                for(int i = 0; i < this.data.length -1; i++){
                    this.data[i] = this.data[i+1];
                }
            }
            else{
                this.data[0] = this.data[1];
            }
        }

        return element;
    }
    public int size(){
        return this.data.length;
    }


}
