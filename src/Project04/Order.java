package Project04;

import java.util.Objects;

public class Order {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
                        //自动生成的equals
   //    @Override
   //    public boolean equals(Object o) {
   //        if (this == o) return true;
   //        if (o == null || getClass() != o.getClass()) return false;
   //        Order order = (Order) o;
   //        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
   // }
                          //手写equals方法

    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj instanceof Order){
            Order order = (Order)obj;
             return this.orderId==order.orderId&&this.orderName.equals(orderName);
        }
        return false;
    }
}
