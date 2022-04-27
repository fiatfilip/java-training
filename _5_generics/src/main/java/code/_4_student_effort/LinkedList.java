package code._4_student_effort;

interface IGenericList<T>{
    void insert(T element);
    void println();
}

interface IGenericNode<T>{
    T getValue();
    void setValue(T value);
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);
}

class GenericNode<T> implements IGenericNode<T>{
    private T value;
    private IGenericNode<T> next;
    public T getValue(){return this.value;}
    public void setValue(T value){this.value=value;}
    public IGenericNode<T> getNext() {return this.next;}
    public void setNext(IGenericNode<T> next){this.next=next;}
}

class GenericList<T> implements  IGenericList<T>{
    IGenericNode<T> root;

    GenericList(T root)
    {
        this.root=new GenericNode<>();
        this.root.setValue(root);
    }
    @Override
    public void insert(T element){
        IGenericNode<T> cursor=this.root;
        while(cursor.getNext()!=null){
            cursor=cursor.getNext();
        }
        IGenericNode<T> newNode=new GenericNode();
        newNode.setValue(element);
        cursor.setNext(newNode);
    }
    public void println(){
        IGenericNode<T> cursor=this.root;
        while(cursor.getNext()!=null){
            cursor=cursor.getNext();
            System.out.println(cursor.getValue());
        }
    }
}

public class LinkedList {
    public static void main(String[] args) {
        String rootValue="a";
        GenericList<String> list=new GenericList<>(rootValue);
        for(int i=1;i<10;i++){
            list.insert(String.valueOf(Character.valueOf((char)(rootValue.charAt(0)+i))));
        }
        list.println();
    }
}
