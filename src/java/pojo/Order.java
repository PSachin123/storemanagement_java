
package pojo;

import java.util.Date;
import java.util.ArrayList;

public class Order 
{
    int order_no,customer_id;
    Date order_date;
    ArrayList<Items> listorder;

    public int getOrder_no() {
        return order_no;
    }

    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public ArrayList<Items> getListorder() {
        return listorder;
    }

    public void setListorder(ArrayList<Items> listorder) {
        this.listorder = listorder;
    }
    
    
}
