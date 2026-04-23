public class Insert {
    int[] Elements = new int[100];
    int size = 0;
    public void insertBeginning(int value){
        for(int i = size - 1; i >= 0; i--){
            Elements[i + 1] = Elements[i];
        }
        Elements[0] = value;
        size++;
    }
    public void insertEnd(int value){
        Elements[size] = value;
        size++;
    }
    public void insertAt(int value, int index){
        for(int i = size - 1; i >= index; i--){
            Elements[i + 1] = Elements[i];
        }
        Elements[index] = value;
        size++;
    }
    public void deleteAt(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        for(int i = index; i < size - 1; i++){
            Elements[i] = Elements[i + 1];
        }
        size--;
    }
    public static void main(String[] args){
        Insert insert = new Insert();
        insert.insertEnd(10);
        insert.insertEnd(20);
        insert.insertBeginning(5);
        insert.insertAt(15, 2); 
        insert.deleteAt(50);
        for(int i = 0; i < insert.size; i++){   
            System.out.print(insert.Elements[i] + " ");
        }
    }
}    