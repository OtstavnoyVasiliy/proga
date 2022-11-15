public class ListItem <Item> {
    private Item data;
    ListItem<Item>next;
    private ListItem<Item> prev;
    ListItem(Item d){
        data=d;
        next=null;
        prev=null;
    }
    public Item getdata(){
        return data;
    }

    public void setdata(Item d) {
        data = d;
    }
    public ListItem<Item> getprev(){
        return prev;
    }

    public ListItem<Item> getnext() {
        return next;
    }

    public void setprev(ListItem<Item> li) {
        prev = li;
    }
    public void setnext(ListItem<Item> li) {
        next = li;
    }
}
