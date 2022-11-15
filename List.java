public class List <Item>{
    private int kol;
    private ListItem<Item> first;
    private ListItem<Item> last;
    List(){
        kol=0;
        first=null;
        last=null;
    }
    List(Item data){
        first=last=new ListItem<Item>(data);
        kol=1;
    }
    public void add(Item data){
        ListItem<Item> li=new ListItem<Item>(data);
        li.setnext(null);
        if (kol>0){
            li.setprev(last);
            last.setnext(li);
        }
        else{
          first=li;
        }
        last=li;
        kol++;
    }

    public ListItem<Item> getFirst() {
        return first;
    }

    public ListItem<Item> getLast() {
        return last;
    }

    public int getquan() {
        return kol;
    }
    public ListItem<Item> get(int i){
        if (i>kol)
            return null;
        else{
            ListItem<Item> li=first;
            for (int j=1;j<i;j++){
                li=li.getnext();
            }
            return li;
        }
    }
    void print(){
        ListItem<Item> li=first;
        while (li!=null){
            System.out.println(li.getdata());
            li=li.getnext();
        }
    }
    public void remove(int i){
        if (i<=kol){
            ListItem<Item> li=get(i);
            ListItem<Item> prev=li.getprev();
            ListItem<Item> next=li.getnext();
            if (prev!=null){
                prev.setnext(next);
            }
            if (next!=null){
                next.setprev(prev);
                if (i==1){
                    first=next;
                }

            }
            kol--;
        }
    }
    boolean isSim(){
        ListItem<Item> li1=first;
        ListItem<Item> li2=last;
        boolean t=true;
        for(int i=0;i<=kol/2;i++)
        {
            if(!li1.getdata().equals(li2.getdata()))
                t=false;
            li1=li1.getnext();
            li2=li2.getprev();
        }
        return t;
    }




}
